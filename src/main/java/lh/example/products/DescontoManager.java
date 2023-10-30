package lh.example.products;

public class DescontoManager {
    public double aplicarDesconto(double valor, double desconto) {
        return valor - (valor * desconto);
    }
}
