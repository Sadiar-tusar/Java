
package newcrud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import newcrud.util.NbUtil;

public class NewCrud {

    static NbUtil n=new NbUtil();
    static PreparedStatement ps;
    static String sql="";
    
    public static void main(String[] args) {
       
        saveStudent("Rohim", "rohim@gmail.com");
         System.out.println("After Save");
         
         showAllStudent();
        System.out.println("-------------------------");
        
        updateStudent("Md Khan", "khan@gmail.com", 1);
        System.out.println("After Update");
        showAllStudent();
        System.out.println("-------------------------");
        
        deleteStudent(2);
        System.out.println("After Delete");
        showAllStudent();
        
        System.out.println("-------------------------");
        
    }
    
     public static void saveStudent(String name, String email){
    
        sql="insert into student(name, email) values(?,?)";
       try {
           ps=n.getCon().prepareStatement(sql);
           ps.setString(1, name);
           ps.setString(2, email);
          
           
           ps.executeUpdate();
           ps.close();
           n.getCon().close();
           
           System.out.println("Data Save");
           System.out.println("---------------------");
       } catch (SQLException ex) {
           Logger.getLogger(NewCrud.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
     
      public static void showAllStudent(){
    
        sql="select * from student";
        
       try {
           ps=n.getCon().prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           
            
            while(rs.next()){
                 int id = rs.getInt("id");
             String name = rs.getString("name");
                String email = rs.getString("email");
                
                System.out.println("ID: " + id+"\n" + " Name: " + name+"\n" + " Email: "
                        + email);
            }
            
             rs.close();
            ps.close();
            n.getCon().close();
               
       } catch (SQLException ex) {
           Logger.getLogger(NewCrud.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
      
       public static void deleteStudent(int id){
    
        sql="delete from student where id=?";
        
       try {
           ps = n.getCon().prepareStatement(sql);
           
            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
            n.getCon().close();
       } catch (SQLException ex) {
           Logger.getLogger(NewCrud.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
       
         public static void updateStudent(String name, String email, int id){
    
         sql = "update student set name=?, email=? where id=?";
         
       try {
           ps = n.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setInt(3, id);

            ps.executeUpdate();

            ps.close();
            n.getCon().close();
       } catch (SQLException ex) {
           Logger.getLogger(NewCrud.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
}
