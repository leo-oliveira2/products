package lh.example.products;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Inicie seu servidor aqui

        // Teste a conexão com o banco de dados
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/seu_banco_de_dados",
                "sa", "")) {
            if (connection != null) {
                System.out.println("Conectado ao banco de dados!");
            } else {
                System.out.println("Falha na conexão ao banco de dados!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}