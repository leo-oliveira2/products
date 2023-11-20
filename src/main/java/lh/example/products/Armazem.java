package lh.example.products;

import java.util.ArrayList;
import java.util.List;

public class Armazem {

    private List<Estoque> estoque;

    public Armazem() {
        estoque = new ArrayList<>();
    }

    public void adicionarEstoque(Estoque est) {
        estoque.add(est);
    }

    public List<Estoque> listarProdutos() {
        return estoque;
    }

    public Produto consultaProduto(Produto produto) {
        for (Estoque est : estoque) {
            for (Object obj : est.getProdutos()) {
                Produto prod = (Produto) obj;
                if (prod.getId() == produto.getId()) {
                    return prod;
                }
            }
        }
        return null;
    }

}
