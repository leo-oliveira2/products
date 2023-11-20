package lh.example.products;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {

    @GetMapping("/")
    public String home() {
        return "Bem-vindo à página inicial da Loja!";
    }

    @GetMapping("/produtos")
    public List<Produto> getProdutos() {
        List<Produto> produtos = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/banco_fds", "root", "nova_senha");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM PRODUTOS");

            while (rs.next()) {
                Produto produto = new Produto(rs.getInt("id"), rs.getString("nome"), rs.getDouble("valor"));
                produtos.add(produto);
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return produtos;

         /*
         * Quando um cliente quer comprar um ou mais itens ele faz um pedido. No pedido consta o identificador do pedido, o nome do cliente, 
         * e uma lista de itens. Cada item tem o código do produto, e a quantidade desejada. A partir do pedido é gerado um orçamento. 
         * Um orçamento possui um código, a data, o nome do cliente, o pedido, o somatório dos custos dos itens do pedido, o valor do imposto (10%), 
         * o valor do desconto (o padrão é 5% para pedidos com mais de 5 itens) e o valor final para o consumidor. Todos os orçamentos são armazenados
         * para consulta futura. Se o cliente aprovar o orçamento basta indicar que deseja efetivar a venda informando o número do orçamento. 
         * Neste momento o sistema deve verificar a viabilidade da venda, isto é, 
         * se existem produtos suficientes no estoque para atender ao pedido. Em caso positivo, o sistema faz a baixa no estoque e marca o
         */

    }
}