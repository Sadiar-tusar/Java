
package libraraymanagementsystem.item.book;

import java.util.Date;
import libraraymanagementsystem.item.Item;


public class Magazine extends Item{
    
    private Date issuDate;
    private int slNumber;

    public Magazine() {
    }

    public Magazine(Date issuDate, int slNumber) {
        this.issuDate = issuDate;
        this.slNumber = slNumber;
    }

    public Magazine(Date issuDate, int slNumber, String title, String author, int yearPublished) {
        super(title, author, yearPublished);
        this.issuDate = issuDate;
        this.slNumber = slNumber;
    }

   

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("IssuDate: "+issuDate);
        System.out.println("Sl Number: "+slNumber);
    }
    
    
}
