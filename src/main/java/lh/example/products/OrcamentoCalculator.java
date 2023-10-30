package lh.example.products;

public class OrcamentoCalculator {
    private ImpostoCalculator impCalculator;
    private DescontoManager descManager;

    public OrcamentoCalculator() {
        this.impCalculator = new ImpostoCalculator();
        this.descManager = new DescontoManager();
    }

    public double calcularOrcamento(double valor, double desconto) {
        double valorComDesconto = descManager.aplicarDesconto(valor, desconto);
        double valorComImposto = impCalculator.calcularImposto(valorComDesconto);
        return valorComImposto;
    }
}
