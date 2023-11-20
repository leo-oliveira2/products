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
    }
}