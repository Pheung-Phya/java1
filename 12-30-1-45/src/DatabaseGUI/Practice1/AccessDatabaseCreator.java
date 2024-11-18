package DatabaseGUI.Practice1;
//import com.healthmarketscience.jackcess.Database;
//import com.healthmarketscience.jackcess.DatabaseBuilder;
//import java.io.File;
//import java.io.IOException;
//
//public final class AccessDatabaseCreator {
//    private final String DATABASE_NAME = "phya.accdb";
//    private final String DATABASE_PATH = "C:\\Users\\USER\\Desktop\\"+DATABASE_NAME; // Specify your desired path
//
//    public AccessDatabaseCreator() {
//        createDatabase();
//    }
//
//    public void createDatabase() {
//        try {
//            File dbFile = new File(DATABASE_PATH);
//            if (!dbFile.exists()) {
//                try (Database db = DatabaseBuilder.create(Database.FileFormat.V2019, dbFile)) {
//                    System.out.println("Database 'mc.accdb' created successfully.");
//                }
//            } else {
//                System.out.println("Database already exists at " + DATABASE_PATH);
//            }
//        } catch (IOException e) {
//            System.out.println("Error creating database: " + e.getMessage());
//        }
//    }
//    
//
//    public static void main(String[] args) {
//        new AccessDatabaseCreator();
//    }
//}

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AccessDatabaseCreator {
    private final String DATABASE_NAME = "etec.accdb"; // Name of the Access database
    private final String DATABASE_PATH = "C:\\Users\\USER\\Desktop\\" + DATABASE_NAME; // Path to the Access database

    public AccessDatabaseCreator() {
        createDatabaseAndTable();
    }
    private void createDatabaseAndTable() {
        Connection conn = null;
        Statement stm = null;
        try {
            File dbFile = new File(DATABASE_PATH);
            if (!dbFile.exists()) {
                dbFile.createNewFile();
                System.out.println("Database '" + DATABASE_NAME + "' created successfully.");
            } else {
                System.out.println("Database already exists at " + DATABASE_PATH);
            }

            // Connect to the Access database using UCanAccess
            String url = "jdbc:ucanaccess://" + DATABASE_PATH;
            conn = DriverManager.getConnection(url);
            System.out.println("Connected to Access database successfully.");
            String createTableSQL = "CREATE TABLE IF NOT EXISTS student ("
                    + "id AUTOINCREMENT PRIMARY KEY, "
                    + "name VARCHAR(50) NOT NULL, "
                    + "gender VARCHAR(50) NOT NULL, "
                    + "course VARCHAR(50) NOT NULL, "
                    + "price FLOAT NOT NULL"
                    + ")";
            stm = conn.createStatement();
            stm.executeUpdate(createTableSQL);
            System.out.println("Table 'student' created successfully (if it didn't exist already).");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error creating database file: " + e.getMessage());
        } finally {
            // Close the statement and connection to release resources
            try {
                if (stm != null) {
                    stm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error closing resources: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new AccessDatabaseCreator();
    }
}
