package lh.example.products;

public class Produto {
    private int id;
    private String nome;
    private double valor;

    public Produto() {
    }

    public Produto(int id, String nome, double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String toString(){
        return String.format("Id : %d \nNome: %s\nValor: %.2f", this.getId(), this.getNome(), this.getValor());
    }

}
