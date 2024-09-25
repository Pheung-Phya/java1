package rupp_access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class Rupp_Access {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {     
            
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            //String dbPath = "C:\\Users\\USER\\Documents\\Access\\Ch04_TinyCollege.accdb";
            String url = "jdbc:ucanaccess://C:/Users\\USER\\Documents\\Access\\Ch04_TinyCollege.accdb"; //+ dbPath;
            con = DriverManager.getConnection(url);
            
            String sql = "SELECT * FROM COURSE";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println("Column1: " + rs.getString(1));
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found Exception: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Exception during closing resources: " + e.getMessage());
            }
            
        }
    }
}
