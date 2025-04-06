
package countingmonetaryunits;

import java.util.Scanner;


public class CountingMonetaryUnits {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an Amount in Double as 11.56");
        double amount=input.nextDouble();
        
        int remainingAmount=(int)amount * 100;
        
    }
    
}
