
package lh.example.products;

import java.util.ArrayList;
import java.util.List;

public class Estoque extends Produto {

    private int qtdMaxProd;
    private int qtdMinProd;

    public Estoque(int qtdMax, int qtdMin) {
        super();
        produtos = new ArrayList<>();
        this.qtdMaxProd = qtdMax;
        this.qtdMinProd = qtdMin; 
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto.toString());
        }
    }
}
