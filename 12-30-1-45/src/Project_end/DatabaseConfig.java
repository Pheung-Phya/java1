package Project_end;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DatabaseConfig {
        private final String HOSTNAME = "localhost";
        private final String USERNAME = "root";
        private final String PASSWORD = "";
        private final String DATABASE = "etec";
        private final int PORT = 3306;
        private Connection conn;
        private Statement stm,stm1;
        public DatabaseConfig(){
            try {
                String URL = "jdbc:mysql://" + HOSTNAME + ":" + PORT + "/" + DATABASE;
                conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                String sql = "CREATE TABLE IF NOT EXISTS LOGINFORM (" +
                                    "username VARCHAR(50) NOT NULL, " +
                                    "useremail VARCHAR(50) UNIQUE PRIMARY KEY, " +
                                    "password VARCHAR(50) NOT NULL" +
                                    ")";
                                    stm = conn.prepareStatement(sql);
                                   stm.execute(sql);
                        String sql1 = "CREATE TABLE IF NOT EXISTS FOODFORM (" +
                                      "item VARCHAR(50) NOT NULL, " +
                                      "amount INT, " +
                                      "price DOUBLE(5,2), " +
                                      "total DOUBLE(5,2), " +
                                      "useremail VARCHAR(50) NOT NULL, " +
                                      "FOREIGN KEY (useremail) REFERENCES LOGINFORM(useremail) ON DELETE CASCADE" +
                                      ")";
                                stm1 = conn.prepareStatement(sql1);
                                stm1.execute(sql1);
                                System.out.println("success connection");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Connect false");
            }
        }
        public Connection connecthzhz(){
                   return conn;
        }
}
