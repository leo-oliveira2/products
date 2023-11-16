package lh.example.products;

public class OrcamentoCalculator {
    private ImpostoCalculator impCalculator;
    private DescontoManager descManager;
    private Cliente c;

    public OrcamentoCalculator() {
        this.impCalculator = new ImpostoCalculator();
        this.descManager = new DescontoManager();
    }

    public double calcularOrcamento(double valor, double desconto) {
        double valorComDesconto = descManager.aplicarDesconto(c);
        double valorComImposto = impCalculator.calcularImposto(valorComDesconto);
        return valorComImposto;
    }
}
