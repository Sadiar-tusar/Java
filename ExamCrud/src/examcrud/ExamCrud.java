
package examcrud;

import examcrud.util.ExamUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExamCrud {
    
    static ExamUtil eu=new ExamUtil();
    static PreparedStatement ps;
    static String sql="";

    public static void main(String[] args) {
        
        
        saveEmployee("Atiq", "Junior Sft Engieniar", 20000f);
         System.out.println("After Save");
         
         showAllEmployee();
        System.out.println("-------------------------");
        
        updateEmployee("Siam Rahman", "Senior sft Engieniar", 30000f, 1);
        System.out.println("After Update");
        showAllEmployee();
        System.out.println("-------------------------");
        
        deleteEmployee(2);
        System.out.println("After Delete");
        showAllEmployee();
        
        System.out.println("-------------------------");
        
        
    }
    
     public static void saveEmployee(String name, String designation, float salary){
    
        sql="insert into employee(name, designation, salary) values(?,?,?)";
       try {
           ps=eu.getCon().prepareStatement(sql);
           ps.setString(1, name);
           ps.setString(2, designation);
           ps.setFloat(3, salary);
           
           
           ps.executeUpdate();
           ps.close();
           eu.getCon().close();
           
           System.out.println("Data Save");
           System.out.println("---------------------");
       } catch (SQLException ex) {
           Logger.getLogger(ExamCrud.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
     
     public static void showAllEmployee(){
    
        sql="select * from employee";
        
       try {
           ps=eu.getCon().prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           
            
            while(rs.next()){
                 int id = rs.getInt("id");
             String name = rs.getString("name");
                String designation = rs.getString("designation");
                float salary = rs.getFloat("salary");
               
                System.out.println("ID: " + id+"\n" + " Name: " + name+"\n" + " Designation: "
                        + designation+"\n"+"Salary: "+salary);
            }
            
             rs.close();
            ps.close();
            eu.getCon().close();
               
       } catch (SQLException ex) {
           Logger.getLogger(ExamCrud.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
     
      public static void deleteEmployee(int id){
    
        sql="delete from employee where id=?";
        
       try {
           ps = eu.getCon().prepareStatement(sql);
           
            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
            eu.getCon().close();
       } catch (SQLException ex) {
           Logger.getLogger(ExamCrud.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
       
         public static void updateEmployee(String name, String designation, float salary, int id){
    
         sql = "update employee set name=?, designation=?, salary=? where id=?";
         
       try {
           ps = eu.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, designation);
            ps.setFloat(3, salary);
            ps.setInt(4, id);

            ps.executeUpdate();

            ps.close();
            eu.getCon().close();
       } catch (SQLException ex) {
           Logger.getLogger(ExamCrud.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
}
