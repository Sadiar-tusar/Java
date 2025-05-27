
package dao;

import entity.Supplier;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import util.DatabaseUtil;

public class SupplierDao {
    
    DatabaseUtil util=new DatabaseUtil();
    PreparedStatement ps;
    String sql="";
    
    public void saveSupplier(String name, String email, String cell, String address, String contactPerson){
    
        sql="insert into suppliers(name, email, cell, address, contactPerson) values (?,?,?,?,?)";
        try {
            ps=util.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, cell);
            ps.setString(4, address);
            ps.setString(5, contactPerson);
            
            ps.executeUpdate();
            
            ps.close();
            util.getCon().close();
            
            JOptionPane.showMessageDialog(null, "Supplier Saved Successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Supplier Saved Not Successfully");
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void showAllSupplier(JTable jt){
    
        String[] columName={"Id", "Name", "Addrerss", "Cell", "Email", "contactPerson"};
        DefaultTableModel tableModel=new DefaultTableModel(columName, 0);
        jt.setModel(tableModel);
        
        sql="select * from suppliers";
        
        try {
            ps=util.getCon().prepareStatement(sql);
            
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
            
                int id=rs.getInt("id");
                String name=rs.getString("name");
                String email=rs.getString("address");
                String cell=rs.getString("cell");
                String address=rs.getString("email");
                String contactPerson=rs.getString("contactPerson");
                
                Object[] rowData={id, name, email, cell, address, contactPerson};
                tableModel.addRow(rowData);
                
               
            }
            
             rs.close();
                ps.close();
                util.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    
    public void deleteSupplier(int id, JTable jt){
    
    sql="delete from suppliers where id=?";
    
        try {
            ps=util.getCon().prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
            util.getCon().close();
            
            JOptionPane.showMessageDialog(null, "Delete Supplier Successfully");
            showAllSupplier(jt);
        } catch (SQLException ex) {
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editSupplier(int id, String name, String email, String cell, String address, String contactPerson, JTable jt){
    
        sql="update suppliers set name=?, address=?, cell=?, email=?, contactPerson=? where id=?";
    
        try {
            ps=util.getCon().prepareStatement(sql);
            
            ps.setString(1, name);
            ps.setString(2, address);
            ps.setString(3, cell);
            ps.setString(4, email);
            ps.setString(5, contactPerson);
            ps.setInt(6, id);
            
            ps.executeUpdate();
            ps.close();
            util.getCon().close();
            
            JOptionPane.showMessageDialog(null, "Supplier Updated Successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Supplier Updated  Not Successfully");
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void showAllSupplierToPurchaseComboBox(JComboBox<String> supplierComboList){
    
         List<Supplier> supplierList=new ArrayList<>();
       
        supplierComboList.removeAllItems();
        sql="select * from suppliers";
        
        try {
            ps=util.getCon().prepareStatement(sql);
            
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
            
                int id=rs.getInt("id");
                String name=rs.getString("name");
                String email=rs.getString("address");
                String cell=rs.getString("cell");
                String address=rs.getString("email");
                String contactPerson=rs.getString("contactPerson");
                
               Supplier s=new Supplier(id, name, address, cell, email, contactPerson);
               supplierList.add(s);
               
            }
            
             rs.close();
                ps.close();
                util.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   for(Supplier su: supplierList){
   
      supplierComboList.addItem(su.getName());
   }
    }
    
    
}
