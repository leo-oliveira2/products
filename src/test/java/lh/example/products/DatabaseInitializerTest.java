package lh.example.products;

import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DatabaseInitializerTest {

    @Test
    public void testInitializeDatabaseCreatesTable() throws Exception {
        // Carregar o driver JDBC do H2
        Class.forName("org.h2.Driver");

        // Estabelecer uma conexão com o banco de dados H2 em memória
        String url = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
        String user = "sa";
        String password = "";
        Connection connection = DriverManager.getConnection(url, user, password);

        DatabaseInitializer initializer = new DatabaseInitializer();
        initializer.initializeDatabase();

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement
                .executeQuery("SELECT * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_NAME = 'PRODUTOS'");

        assertTrue(resultSet.next());

        connection.close();
    }

    @Test
    public void testInitializeDatabaseInsertsData() throws Exception {
        DatabaseInitializer initializer = new DatabaseInitializer();
        initializer.initializeDatabase();

        Class.forName("org.h2.Driver");

        // Estabelecer uma conexão com o banco de dados H2 em memória
        String url = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
        String user = "sa";
        String password = "";
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM PRODUTOS WHERE id = 1");

        assertTrue(resultSet.next());
        assertEquals(1, resultSet.getInt("id"));
        assertEquals("Camiseta Branca P Básica", resultSet.getString("nome"));
        assertEquals(20.00, resultSet.getDouble("valor"), 0.01);

        connection.close();
    }
}