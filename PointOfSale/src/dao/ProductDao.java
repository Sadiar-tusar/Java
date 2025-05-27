
package dao;

import entity.Category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import util.DatabaseUtil;

public class ProductDao {
    
     DatabaseUtil util=new DatabaseUtil();
    PreparedStatement ps;
    String sql="";
    ResultSet rs;
    
    CategoryDao categoryDao=new CategoryDao();
    
    public void losdCategoryByProductCombo(JComboBox<String> catList){
    
        catList.removeAllItems();
        List<Category> categories=new ArrayList<>();
        
        categories=categoryDao.getAllCategory();
        
        for(Category c : categories){
        
            catList.addItem(c.getName());
        }
        
    
    }
}
