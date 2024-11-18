
package DatabaseGUI.Practice1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Config1 {
    private final String HOSTNAME = "localhost";
    private final String USERNAME = "root";
    private final String PASSWORD = "";
    private final String DATABASE = "phya";
    private final int PORT = 3306;
    private Connection conn;
    private Statement stm;

    public Connection getConnection() {
        return this.conn;
    }

    public Config1() {
        try {
            String url = "jdbc:mysql://" + HOSTNAME + ":" + PORT;
            conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
            String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS " + DATABASE;
            stm = conn.createStatement();
            stm.executeUpdate(createDatabaseSQL);
            System.out.println("Database '" + DATABASE + "' created successfully (if it didn't exist already).");
            url = "jdbc:mysql://" + HOSTNAME + ":" + PORT + "/" + DATABASE;
            conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
            String createTableSQL = "CREATE TABLE IF NOT EXISTS student ("
                    + "id INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY, "
                    + "name VARCHAR(50) NOT NULL, "
                    + "gender VARCHAR(50) NOT NULL, "
                    + "course VARCHAR(50) NOT NULL, "
                    + "price FLOAT NOT NULL"
                    + ")";
            stm = conn.createStatement();
            stm.execute(createTableSQL);
            System.out.println("Table 'student' created successfully (if it didn't exist already).");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args){
        new Config1();
    }
}
