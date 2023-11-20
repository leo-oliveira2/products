import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatabaseInitializerTest {

    @Test
    public void testInitializeDatabase() throws Exception {

        DatabaseInitializer initializer = new DatabaseInitializer();

        initializer.initializeDatabase();

        String url = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
        String user = "teste";
        String password = "123";
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) FROM PRODUTOS");

        resultSet.next();
        int count = resultSet.getInt(1);
        assertEquals(1, count);

        connection.close();
    }
}