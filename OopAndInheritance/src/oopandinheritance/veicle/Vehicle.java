
package oopandinheritance.veicle;


public class Vehicle {
    
     private int speed;
    private double regularPrice;
    private String color;
    private double salePrice;

    public Vehicle() {
    }

    public Vehicle(int speed, double regularPrice, String color, double salePrice) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
        this.salePrice = salePrice;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
    
   
}
