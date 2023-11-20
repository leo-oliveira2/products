package lh.example.products;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/banco_fds", "root", "nova_senha");

            // Cria um Statement para executar a consulta
            Statement stmt = conn.createStatement();

            // Executa a consulta
            ResultSet rs = stmt.executeQuery("SELECT * FROM PRODUTOS");

            // Imprime os resultados
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" +
                        rs.getString("nome") + "\t" +
                        rs.getDouble("valor"));
            }

            // Fecha a conexão
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}