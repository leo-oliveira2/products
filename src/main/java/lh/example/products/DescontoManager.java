package lh.example.products;

public class DescontoManager {

    //(valor do pedido) - (valor do pedido * desconto)
    //

    private double descontoTresMeses(Cliente c) {
        double desconto = 1;
        if(c.ultimosTres() >= 10000){
            desconto = 0.1;
            if(c.ultimosTres() >= 20000){
                desconto = 0.15;
                if(c.ultimosTres() >= 30000){
                    desconto =0.2;
                    if(c.ultimosTres() >= 40000){
                        desconto =0.25;
                        if(c.ultimosTres() >= 50000){
                            desconto= 0.3; //30 % max
                        }
                    }
                }
            }

        }
        return desconto;
    }

    private double descontoSeisMeses(Cliente c){
        double desconto = 1;
        if(c.qtdPedidosUltimosSeis() >= 10){
            desconto= 0.25;
        }
        return desconto;
    }

    public double aplicarDesconto(Cliente c){
        double a= descontoTresMeses(c);
        double b= descontoSeisMeses(c);
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
}
