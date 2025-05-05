
package examvehicle;

import examvehicle.ve.Truck;


public class ExamVehicle {

    
    public static void main(String[] args) {
       
        Truck t=new Truck();
        
       t.setWeight(3000);
       t.setRegularPrice(100);
        System.out.println(t.getSalePrice());
    }
    
}
