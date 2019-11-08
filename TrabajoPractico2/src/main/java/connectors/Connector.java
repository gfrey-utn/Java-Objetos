package connectors;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
    private static String driver = "com.mysql.cj.jdbc.Driver";
    
    // Localhost
    // private static String url = "jdbc.mysql://localhost:3306/futbol";
    // private static String user = "root";
    // private static String pass = "root";
    
    // remotemysql.com
    private static String url = "jdbc:mysql://remotemysql.com:3306/dgFKvkNPYA";
    private static String user = "dgFKvkNPYA";
    private static String pass = "u3sT52syX0";
    
    private static Connection conn = null;
    private Connector(){}
    public synchronized static Connection getConnection(){
        if (conn == null) {
            try {
                Class.forName(driver);
                conn = DriverManager.getConnection(url,user,pass);
            } catch (Exception e) { e.printStackTrace(); }
        }
        return conn;
    }
}
