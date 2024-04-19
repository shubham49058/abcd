import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JdbcExample {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/school";
        String username = "root";
        String password = "Root";
		
		try {
		Connection connection=DriverManager.getConnection(url, username, password);
		
		
		if (connection != null) {
            System.out.println("Connected to the database!");
            // Perform database operations here

            // Close the connection when done
            connection.close();
        }
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}