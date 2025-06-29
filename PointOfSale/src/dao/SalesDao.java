
package dao;

import entity.Category;
import entity.Sales;
import entity.Stock;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import util.DatabaseUtil;


public class SalesDao {
    
    
    DatabaseUtil util=new DatabaseUtil();
    PreparedStatement ps;
    String sql="";
    ResultSet rs;
    
     CategoryDao categoryDao = new CategoryDao();
    StockDao stockDao = new StockDao();
    
     public void loadProduct(JComboBox<String> comboProductList, String category) {

        comboProductList.removeAllItems();

        List<Stock> stockList = stockDao.getProductByCategory(category);

        //Check if the suppliers list is empty
        if (stockList.isEmpty()) {
            System.out.println("No Stoct Found");
            return;
        }

        for (Stock s : stockList) {

            comboProductList.addItem(s.getProductName());
        }

    }

    public void loadCategory(JComboBox<String> comboCategoryList) {

        comboCategoryList.removeAllItems();

        List<Category> catList = categoryDao.getAllCategory();

        //Check if the suppliers list is empty
        if (catList.isEmpty()) {

            System.out.println("No Category Found");
            return;
        }

        for (Category cat : catList) {
            comboCategoryList.addItem(cat.getName());

        }

    }
    
    public void saveSales(Sales s){
    
    sql="insert into sales(category, productName, customerName, unitPrice, quantity, totalPrice, discount, actualAmount, date) values (?,?,?,?,?,?,?,?,now())";
    
        try {
            ps=util.getCon().prepareStatement(sql);
            
            ps.setString(1, s.getCategory());
            ps.setString(2, s.getProductName());
            ps.setString(3, s.getCustomerName());
            ps.setFloat(4, s.getUnitPrice());
            ps.setFloat(5, s.getQuantity());
            ps.setFloat(6, s.getTotalPrice());
            ps.setFloat(7, s.getDiscount());
            ps.setFloat(8, s.getActualAmount());
            
            ps.executeUpdate();
            
            ps.close();
            util.getCon().close();
            
            JOptionPane.showMessageDialog(null, "Sales successfully");
           
          
        } catch (SQLException ex) {
            Logger.getLogger(SalesDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
