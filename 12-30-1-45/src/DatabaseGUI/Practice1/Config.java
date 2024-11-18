package DatabaseGUI.Practice1;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Config {
        private final String HOSTNAME= "localhost";
        private final String USERNAME = "root";
        private final String PASSWORD = "";
        private final String DATABASE = "etec";
        private final int PORT = 3306;
        Connection conn;
        Statement stm;
        public Connection getConnection() {
                 return this.conn;
        }
        public Config(){
                  try{
                           String url = "jdbc:mysql://"+HOSTNAME+":"+PORT+"/"+DATABASE;
                           conn = (Connection) DriverManager.getConnection(url,USERNAME,PASSWORD);
                           String sql ="CREATE TABLE IF NOT EXISTS student("
                                    + "id INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,"
                                    +"name VARCHAR(50) NOT NULL,"
                                   +"gender VARCHAR(50) NOT NULL,"
                                   +"course VARCHAR(50) NOT NULL,"
                                   +"price FLOAT NOT NULL"
                                   +")";                               
                           stm = (Statement) conn.prepareStatement(sql);
                           stm.execute(sql);
                           System.out.println("Table 'users' created successfully (if it didn't exist already).");    
                  }catch(SQLException e){
                           System.out.println(e.getMessage());
                  }
        }
}
