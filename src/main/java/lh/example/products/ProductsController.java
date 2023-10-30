package lh.example.products;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
    
    
    @RequestMapping("/prd")
    public String produto(){
        Produto p = new Produto(1, "Capa", 10.00);
        return String.format("Id %d , Nome %s , Valor %.2f", p.getId(),p.getNome(),p.getValor());
    }
    
}
