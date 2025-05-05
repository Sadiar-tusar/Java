
package oopandinheritance.veicle;


public class Truck extends Vehicle{
    
    private int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, int speed, double regularPrice, String color, double salePrice) {
        super(speed, regularPrice, color, salePrice);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        
         if (weight > 3000) {

            return super.getRegularPrice() - super.getRegularPrice() * 0.10;
        } else {
            return super.getRegularPrice();
        }
    }
    
    
}
