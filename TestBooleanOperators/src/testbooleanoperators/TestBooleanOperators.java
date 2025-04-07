// Listing 3.6 gives a program that checks whether a number is divisible by 2 and 3, by 2 or 
//3, and by 2 or 3 but not both:

package testbooleanoperators;

import java.util.Scanner;


public class TestBooleanOperators {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Number");
        int number=s.nextInt();
        
        if(number % 2==0 && number % 3==0){
            System.out.println(number+" is Divisible by 2 and 3");
           
        }
    }
    
}
