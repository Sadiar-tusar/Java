
package checklargestnumber;

import java.util.Scanner;


public class CheckLargestNumber {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter Number1");
        int number1=input.nextInt();
        
        System.out.println("Enter Number2");
        int number2=input.nextInt();
        
        if(number1 > number2){
            System.out.println(number1+" is Largest Number");
        }
        else{
            System.out.println(number2+" is Largest Number");
        }
    }
    
}
