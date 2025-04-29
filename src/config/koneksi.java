package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class koneksi {
    private static Connection conn;

    public static Connection getConnection() {
         if (conn == null ){
        try {
           
                String url = "jdbc:mysql://localhost:3306/rasty_kichen";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                conn = (Connection) DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conn;
    }
}
