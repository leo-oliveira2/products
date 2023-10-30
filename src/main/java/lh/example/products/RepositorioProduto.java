package lh.example.products;

import java.util.List;

public interface RepositorioProduto {
    void salvar(Produto produto);
    void atualizar(Produto produto);
    void excluir(int produtoId);
    Produto buscarPorId(int produtoId);
    List<Produto> buscarTodos();
}
