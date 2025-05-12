
package libraraymanagementsystem.item.book;

import libraraymanagementsystem.item.Item;


public class Dvd extends Item{
    
    private String itemName;
    private int duration;

    public Dvd() {
    }

    public Dvd(String itemName, int duration) {
        this.itemName = itemName;
        this.duration = duration;
    }

    public Dvd(String itemName, int duration, String title, String author, int yearPublished) {
        super(title, author, yearPublished);
        this.itemName = itemName;
        this.duration = duration;
    }

    @Override
    public void printDetails() {
        
        super.printDetails();
        
        System.out.println("ItemName: "+itemName);
        System.out.println("Duration: "+duration+" Hours");
    }
    
    
}
