package DatabaseGUI;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class DatabaseaAll {
       static Connection getConnection(String url,String name){
        Connection con = null;
        try {
            con=(Connection) DriverManager.getConnection(url,name,"");
           JOptionPane.showMessageDialog(null, "connect success");
            return con;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "not connection");
            return null;
        }
    }
}
