package examvehicle.ve;

public class Truck extends Vehicle {

    private int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if (weight > 2000) {

            return super.getRegularPrice() - super.getRegularPrice() * 0.10;
        } else {
            return super.getRegularPrice();
        }
    }

}
