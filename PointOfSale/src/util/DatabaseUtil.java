
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DatabaseUtil {
    
    private Connection connection=null;
    private String url="jdbc:mysql://localhost:3306/pointofsale";
    private String user="root";
    private String password="1234";
    private String driver="com.mysql.cj.jdbc.Driver";
    
    public Connection getCon(){
    
        try {
            Class.forName(driver);
            
            connection=DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connection;
    }
}
