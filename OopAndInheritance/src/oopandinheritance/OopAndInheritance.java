package oopandinheritance;

import oopandinheritance.veicle.Truck;

public class OopAndInheritance {

    public static void main(String[] args) {

        Truck t = new Truck();

        t.setWeight(5000);
        t.setRegularPrice(100);
        System.out.println(t.getSalePrice());
        
        t.setColor("Red");
        System.out.println(t.getColor());
        
    }

}
