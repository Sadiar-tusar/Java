package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import util.DatabaseUtil;

public class CategoryDao {

    DatabaseUtil util = new DatabaseUtil();
    PreparedStatement ps;
    String sql = "";

    public void saveCategory(String name, JTable jt) {

        sql = "insert into category(name) values (?)";

        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setString(1, name);

            ps.executeUpdate();
            ps.close();
            util.getCon().close();

            JOptionPane.showMessageDialog(null, "Category Save Successfully");
            showAllCategory(jt);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Category Save Not Successfully");
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void showAllCategory(JTable jt) {

        String[] columsName = {"Id", "Name"};
        DefaultTableModel tableModel = new DefaultTableModel(columsName, 0);
        jt.setModel(tableModel);

        sql = "select * from category";

        try {
            ps = util.getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");

                Object[] rowData = {id, name};
                tableModel.addRow(rowData);
            }

            rs.close();
            ps.close();
            util.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void deleteCategory(int id, JTable jt){
    
        sql="delete from category where id=?";
        
        try {
            ps=util.getCon().prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.executeUpdate();
            
            ps.close();
            util.getCon().close();
            
            JOptionPane.showMessageDialog(null, "Category Delete Successfully");
            showAllCategory(jt);
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void editCategory(int id, String name, JTable jt){
    
        sql="update category set name=? where id=?";
        
        try {
            ps=util.getCon().prepareStatement(sql);
           
            ps.setString(1, name);
             ps.setInt(2, id);
            
           ps.executeUpdate();
            
            ps.close();
            util.getCon().close();
            
            JOptionPane.showMessageDialog(null, "Category Updated Successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Category Updated Not Successfully");
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
