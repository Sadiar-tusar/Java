
package learnabstractclass;

import learnabstractclass.abs.Geomatry;
import learnabstractclass.geoobj.Circle;


public class LearnAbstractClass {

    
    public static void main(String[] args) {
        
        Geomatry g=new Circle(5);
        
        System.out.println(g.getArea());
    }
    
}
