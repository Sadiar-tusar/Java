
package newvehiclecarandbike;

import newvehiclecarandbike.vehicle.Bike;
import newvehiclecarandbike.vehicle.Car;
import newvehiclecarandbike.vehicle.Vehicle;


public class NewVehicleCarAndBike {

    
    public static void main(String[] args) {
       
//        Vehicle v=new Vehicle();
        Car c=new Car(5, "TATA", 500);
        Bike b=new Bike();
        
//        c.setBrand("TATA");
//        c.setSpeed(500);
//        
//        c.setNumberOfDoors(5);
        b.setHasCarrier(2);
        
//        v.displayProperties();
        c.displayProperties();
        b.displayProperties();

        
    }
    
}
