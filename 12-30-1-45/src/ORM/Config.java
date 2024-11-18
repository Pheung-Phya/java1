package ORM;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Config {
    private final String HOSTNAME = "localhost";
    private final String USERNAME = "root";
    private final String PASSWORD = "";
    private final String DATABASE = "etec";
    private final int PORT = 3306;
    
    protected Connection conn;
    public Config() {
        try {
            String url = "jdbc:mysql://" + HOSTNAME + ":" + PORT + "/" + DATABASE;
            conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
            String sql = "CREATE TABLE IF NOT EXISTS users1 ("
                       + "id INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,"
                       + "name VARCHAR(100) NOT NULL,"
                       + "gender ENUM('Male','Female','Other') DEFAULT 'Male',"
                       + "email VARCHAR(100) NOT NULL UNIQUE,"
                       + "phone VARCHAR(20) NOT NULL UNIQUE,"
                       + "image VARCHAR(30),"
                       + "address TEXT,"
                       + "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP"
                       + ")";
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            System.out.println("Table 'users' created successfully (if it didn't exist already).");    
        } catch (SQLException e) {
                    
        }
    }

    public static void main(String[] args) {
        new Config();  
    }
}

