package dao;

import entity.Category;
import entity.Stock;
import java.sql.PreparedStatement;
import java.util.List;
import javax.swing.JComboBox;
import util.DatabaseUtil;

public class PurchaseDao {

    DatabaseUtil util = new DatabaseUtil();
    PreparedStatement ps;
    String sql = "";

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

}
