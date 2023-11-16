package lh.example.products;

import java.util.Calendar;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Pedido> pedidos;

    public int ultimosTres() {
        int soma = 0;
        if (pedidos.size() <= 3) {
            for (Pedido pedido : pedidos) {
                soma += pedido.getValorTotal();
            }
        } else {
            for (int i = pedidos.size() - 3; i < pedidos.size(); i++) {
                soma += pedidos.get(i).getValorTotal();
            }
        }

        return soma;
    } 

    public int somaSeisMeses() {
        int soma = 0;
        for (Pedido pedido : pedidos) {
            // Assuming that pedido.getData() returns a Date object
            Calendar sixMonthsAgo = Calendar.getInstance();
            sixMonthsAgo.add(Calendar.MONTH, -6);

            if (pedido.getData().before(sixMonthsAgo.getTime()) && pedido.isEfetivado()) {
                soma += pedido.getValorTotal();
            }
        }
        return soma;
    }

    public int qtdPedidosUltimosSeis(){
        int qtdPedidos= 0;
        for(Pedido pedido: pedidos){
            Calendar sixMonthsAgo = Calendar.getInstance();
            sixMonthsAgo.add(Calendar.MONTH, -6);

            if (pedido.getData().before(sixMonthsAgo.getTime()) && pedido.isEfetivado()) {
                qtdPedidos++;
            }
        }
        return qtdPedidos;
    }

    public List<Pedido> getPedidos(){
        return pedidos;
    }

    public String getNome(){
        return nome;
    }

    public void addPedido(Pedido pedido){
        pedidos.add(pedido);
    }
}