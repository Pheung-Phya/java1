
package hotel_system_java;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MY_CONNECTION {
    public Connection createConnection(){
        Connection connection = null;
        MysqlDataSource mds = new MysqlDataSource();
        mds.setServerName("localhost");
        mds.setPort(3306);
        mds.setPassword("");
        mds.setUser("root");       
        mds.setDatabaseName("hotel_system");
          
        try {
            connection = (Connection) mds.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(MY_CONNECTION.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
}
