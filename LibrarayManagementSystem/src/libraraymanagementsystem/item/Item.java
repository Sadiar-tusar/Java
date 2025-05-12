
package libraraymanagementsystem.item;


public class Item {
    
    private String title;
    private String author;
    private int yearPublished;

    public Item() {
    }

    public Item(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    
    public void printDetails(){
    
        
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("yearPublished : "+yearPublished);
    }
}
