package lh.example.products;

import java.util.ArrayList;
import java.util.List;

public class Armazem {
    public List<Estoque> estoque = new ArrayList<>();
    
    public void adicionarEstoque(Estoque est){
        estoque.add(est);
    }

    public Estoque consultaProduto(Produto produto) throws Exception {
        for (int i = 0; i < estoque.size(); i++) {
            if (estoque.get(i).getNome().equals(produto.getNome())) {
                return estoque.get(i);
            }
        }
        throw new Exception("Produto não encontrado no estoque");
    }
}
