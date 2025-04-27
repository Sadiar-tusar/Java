
package inheritencesubs;

import inheritencesubs.apple.Apple;
import inheritencesubs.apple.Mango;
import java.util.Scanner;


public class InheritenceSubS {

    
    public static void main(String[] args) {
       
        Apple a=new Apple();
        Mango m=new Mango();
//        
//        a.setColor("Red");
//        
//        System.out.println(a.getColor());

        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Number");
        int userInput=s.nextInt();
        
       
       a.setSkhfd(userInput);
        System.out.println(a.getPrime());
        
        
        
    }
    
}
