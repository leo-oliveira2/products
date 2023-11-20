package lh.example.products;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseInitializer {

    public void initializeDatabase() {
        try {
            // Substitua estas variáveis com as informações do seu banco de dados

            // Estabelecer uma conexão com o banco de dados H2 em memória
            String url = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
            String user = "sa";
            String password = "";

            // Cria uma conexão com o banco de dados
            Connection connection = DriverManager.getConnection(url, user, password);

            // Cria um Statement para executar o SQL
            Statement statement = connection.createStatement();

            // SQL para criar a tabela e inserir os dados
            String sql = "CREATE TABLE PRODUTOS(" +
                    "id NUMERIC(8) NOT NULL," +
                    "nome VARCHAR(100) NOT NULL," +
                    "valor NUMERIC(7,2) NOT NULL," +
                    "CONSTRAINT PK_Produtos PRIMARY KEY (id)" +
                    ");" +
                    "INSERT INTO PRODUTOS VALUES (1, 'Camiseta Branca P Básica', 20.00);"
            // Adicione o restante dos seus INSERTs aqui
            ;

            // Executa o SQL
            statement.executeUpdate(sql);

            // Fecha a conexão
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}