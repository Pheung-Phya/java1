package Console_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlServerConnectionExample {
    static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=MMABooks;encrypt=true;trustServerCertificate=true";
    static final String USER = "phya";
    static final String PASS = "123";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected to SQL Server successfully!");

            statement = connection.createStatement();
            String sql = "SELECT * FROM products ";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                String code = rs.getString(1);
                String name = rs.getString(2);
                double price = rs.getFloat(3);
                long qty = rs.getLong(4);
                System.out.println("ID: " + code + ", Name: " + name+", Price : "+price+", Qty = "+qty);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
