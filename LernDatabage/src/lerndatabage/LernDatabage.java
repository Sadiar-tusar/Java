package lerndatabage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import lerndatabage.util.DbUtil;

public class LernDatabage {

    public static void main(String[] args) {

        DbUtil du = new DbUtil();

        String sql = "insert into student(name,email,address) values(?,?,?)";

        try {
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter Your Name: ");
            String name = scan.nextLine();

            System.out.print("Enter Your Email: ");
            String email = scan.nextLine();

            System.out.print("Enter Your Address: ");
            String address = scan.nextLine();
            PreparedStatement ps = du.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);

            ps.executeUpdate();

            ps.close();
            du.getCon().close();

            System.out.println("Done");

        } catch (SQLException ex) {
            Logger.getLogger(LernDatabage.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql1 = "select * from student";

        try {

            PreparedStatement ps = du.getCon().prepareStatement(sql1);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");

                System.out.println("Name: " + name + " Email " + email + " Address " + address);
            }

        } catch (SQLException ex) {
            Logger.getLogger(LernDatabage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
