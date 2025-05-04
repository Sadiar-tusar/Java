
package newvehiclecarandbike.vehicle;


public class Car extends Vehicle{
    private int numberOfDoors;

    public Car() {
    }

    public Car(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Car(int numberOfDoors, String brand, double speed) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    
    

    @Override
    public void displayProperties() {
        super.displayProperties(); 
        System.out.println("Number of Doors: "+numberOfDoors);
    }
    
    
}
