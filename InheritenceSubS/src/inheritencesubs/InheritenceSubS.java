
package inheritencesubs;

import inheritencesubs.apple.Apple;
import inheritencesubs.apple.Mango;


public class InheritenceSubS {

    
    public static void main(String[] args) {
       
        Apple a=new Apple();
        Mango m=new Mango();
        
        a.setColor("Red");
        
        System.out.println(a.getColor());
        
        
        Apple input=new Apple();
        System.out.println(a.getPrime());
        
        
        
    }
    
}
