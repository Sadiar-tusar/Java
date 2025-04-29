
package examvehicle;

import examvehicle.ve.Truck;


public class ExamVehicle {

    
    public static void main(String[] args) {
       
        Truck t=new Truck();
        
       t.setWeight(30000);
       t.setRegularPrice(45000);
        System.out.println(t.getSalePrice());
    }
    
}
