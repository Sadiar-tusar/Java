
package libraraymanagementsystem;

import java.util.Date;
import libraraymanagementsystem.item.book.Book;
import libraraymanagementsystem.item.book.Dvd;
import libraraymanagementsystem.item.book.Magazine;


public class LibrarayManagementSystem {

    public static void main(String[] args) {
       
        Book book=new Book("Java", 120, "Set & Maps", "Games Gosling", 1950);
        Date date=new Date(04-05-2025);
        Magazine mg=new Magazine(date, 200, "Scince Houre", "Md. Emran Hossain", 2025);
        Dvd d=new Dvd("Basic Computer", 500, "Html, Css, Bootsrap", "Mycle Omuk", 1948);
        
        System.out.println("===Book Details===");
        book.printDetails();
       System.out.println("---------------\n");
        
        System.out.println("===Magazine Details===");
        mg.printDetails();
        System.out.println("----------------\n");
       
        System.out.println("===Dvd details===");
        d.printDetails();
    }
    
}
