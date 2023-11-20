package lh.example.products;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

    Estoque e = new Estoque(0, 10);

    @RequestMapping("/prd")
    public String produto() {
        Produto p = new Produto(1, "Capa", 10.00);
        return String.format("Id %d , Nome %s , Valor %.2f", p.getId(), p.getNome(), p.getValor());
    }

    @GetMapping("/getproduto")
    public String getProduto(@RequestBody Produto produto) throws Exception {
        Armazem armazem = new Armazem();
        armazem.adicionarEstoque(new Estoque(0, 10));
        Produto prod = armazem.consultaProduto(produto);
        return String.format("Id %d , Nome %s , Valor %.2f", prod.getId(), prod.getNome(), prod.getValor());
    }

    @GetMapping("/listaProdEstoque")
    public void listarProdutos() {
        e.listarProdutos();
    }
}
