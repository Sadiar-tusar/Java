
package newvehiclecarandbike.vehicle;


public class Bike extends Vehicle{
    
    private int hasCarrier;

    public Bike() {
    }

    public Bike(int hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    public Bike(int hasCarrier, String brand, double speed) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    public int getHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(int hasCarrier) {
        this.hasCarrier = hasCarrier;
    }
    
    

    @Override
    public void displayProperties() {
        super.displayProperties();
        System.out.println("Has Carrier: "+hasCarrier);
    }
    
    
}
