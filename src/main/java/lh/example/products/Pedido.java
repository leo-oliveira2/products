package lh.example.products;

import java.util.Calendar;
import java.util.List;

public class Pedido {
    private int idPedido;
    private List<Produto> produtos;
    private int valorTotal;
    private Calendar data;
    private boolean efetivado;

    public Pedido(int idPedido, List<Produto> produtos, Calendar data, boolean efetivado) {
        this.idPedido = idPedido;
        this.produtos = produtos;
        this.data = data;
        this.efetivado = efetivado;
        this.valorTotal = calculaValorTotal(produtos);
    }

    public Pedido(int i, int j, int k, int l, int m, boolean b) {
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

    public Calendar getData() {
        return data;
    }

    public boolean isEfetivado() {
        return efetivado;
    }

    public static int calculaValorTotal(List<Produto> produtos) {
        int totalValor = 0;
        for (Produto produto : produtos) {
            totalValor += produto.getValor();
        }
        return totalValor;
    }

}