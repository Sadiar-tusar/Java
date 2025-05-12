
package libraraymanagementsystem.item.book;

import libraraymanagementsystem.item.Item;


public class Book extends Item{
    
    private String bookName;
    private int page;

    public Book() {
    }

    public Book(String bookName, int page) {
        this.bookName = bookName;
        this.page = page;
    }

    public Book(String bookName, int page, String title, String author, int yearPublished) {
        super(title, author, yearPublished);
        this.bookName = bookName;
        this.page = page;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Book Name: "+bookName);
        System.out.println("Page: "+page);
    }
    
    
}
