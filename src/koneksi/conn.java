
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

public class conn {
    public static Connection getConnection(){
        
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/latihan_db", "root", "");           
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return conn;
    }  
}
