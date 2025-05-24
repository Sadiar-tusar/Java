
package sadiarcrud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sadiarcrud.util.CrudUtil;

public class SadiarCrud {

    static CrudUtil cu=new CrudUtil();
    static PreparedStatement ps;
    static String sql="";
    
    public static void main(String[] args) {
        
        
          saveStudent("Reja", "reja@gmail.com", "Ajimpur");
        System.out.println("After Save");
        showAllStudent();
        System.out.println("-------------------------");

        updateStudent("Rejaul Karim", "reja@gmail.com", "Sankar", 1);
        System.out.println("After Update");
        showAllStudent();
        System.out.println("-------------------------");
        
        

        deleteStudent(2);
        System.out.println("After Delete");
        showAllStudent();
        
        System.out.println("-------------------------");
        
        
    }
    
     public static void saveStudent(String name, String email, String address){
    
        sql="insert into student(name, email, address) values(?,?,?)";
       try {
           ps=cu.getCon().prepareStatement(sql);
           ps.setString(1, name);
           ps.setString(2, email);
           ps.setString(3, address);
           
           ps.executeUpdate();
           ps.close();
           cu.getCon().close();
           
           System.out.println("Data Save");
           System.out.println("---------------------");
       } catch (SQLException ex) {
           Logger.getLogger(SadiarCrud.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    public static void showAllStudent(){
    
        sql="select * from student";
        
       try {
           ps=cu.getCon().prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           
            
            while(rs.next()){
                 int id = rs.getInt("id");
             String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                System.out.println("ID: " + id + " Name: " + name + " Email: "
                        + email + " Address: " + address);
            }
            
             rs.close();
            ps.close();
            cu.getCon().close();
               
       } catch (SQLException ex) {
           Logger.getLogger(SadiarCrud.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    public static void deleteStudent(int id){
    
        sql="delete from student where id=?";
        
       try {
           ps = cu.getCon().prepareStatement(sql);
           
            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
            cu.getCon().close();
       } catch (SQLException ex) {
           Logger.getLogger(SadiarCrud.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    public static void updateStudent(String name, String email, String address, int id){
    
         sql = "update student set name=?, email=?, address=? where id=?";
         
       try {
           ps = cu.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setInt(4, id);

            ps.executeUpdate();

            ps.close();
            cu.getCon().close();
       } catch (SQLException ex) {
           Logger.getLogger(SadiarCrud.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
}
