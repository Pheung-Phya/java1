
package access_jdbc;

import org.hsqldb.jdbc.JDBCDriver;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ACCESS_JDBC {

    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ACCESS_JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
