package crud;

import crud.util.CrUtil;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Crud {

    static CrUtil u = new CrUtil();
   static PreparedStatement ps;
    static String sql="";

    public static void main(String[] args) {

        
        
    }
    
     public static void saveSadiar(String name, String email){
    
        sql="insert into sadiar(name, email) values(?,?)";
      
       ps=u.getCon().
    }

}
