import java.sql.*;

public class LoginInfoExample {
    // JDBC URL, username, and password
    static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:xe";
    static final String USERNAME = "your_username";
    static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String query = "SELECT customers_id, customers_password FROM Login_info";
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {
                while (resultSet.next()) {
                    String customerId = resultSet.getString("customers_id");
                    String customerPassword = resultSet.getString("customers_password");
                    System.out.println("Customer ID: " + customerId + ", Password: " + customerPassword);
                }
            } catch (SQLException ex) {
                System.err.println("Failed to execute query!");
                ex.printStackTrace();
            }
        } catch (SQLException ex) {
            System.err.println("Failed to connect to Oracle database!");
            ex.printStackTrace();
        }
    }
}