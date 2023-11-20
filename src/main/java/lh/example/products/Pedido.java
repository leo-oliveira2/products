package lh.example.products;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;

import org.springframework.cglib.core.Local;

public class Pedido {
    private int idPedido;
    private List<Produto> produtos;
    private int valorTotal;
    private LocalDateTime dataDoPedido;
    private LocalDateTime dataDeExpiracao;
    private Calendar data;
    private boolean efetivado;
    private LocalDateTime agora;

    public Pedido(int idPedido, List<Produto> produtos, Calendar data, boolean efetivado) {
        this.idPedido = idPedido;
        this.produtos = produtos;
        this.data = data; //temp
        this.dataDoPedido = dataDoPedido.now();
        this.dataDeExpiracao = dataDoPedido.plusDays(21);
        this.efetivado = efetivado;
        this.valorTotal = calculaValorTotal(produtos);
    }

    public Pedido(int i, int j, int k, int l, int m, boolean b) {
    }

    public boolean verificar(){
        agora = agora.now();
        if(dataDeExpiracao.isBefore(agora)){
            //setar status como cancelado
            return false;
        }else{
            return true;
        }

        
    }

    public void setEfetivado(){
        this.efetivado = true;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }


    public int getValorTotal() {

        return valorTotal;
    }


    public LocalDateTime getDataExpiracao() {
        return dataDeExpiracao;
    }

    public boolean isEfetivado() {
        return efetivado;
    }

    public Calendar getData(){
        return data;
    }

    public static int calculaValorTotal(List<Produto> produtos) {
        int totalValor = 0;
        for (Produto produto : produtos) {
            totalValor += produto.getValor();
        }
        return totalValor;
    }

}