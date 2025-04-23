
package bigfactorial;

import java.math.BigInteger;
import java.util.Scanner;


public class BigFactorial {

   
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Number");
        int number=s.nextInt();
       
        
//        BigInteger factorial=BigInteger.ONE;
        BigInteger factorial=new BigInteger("1");
        
        for(int i=1; i<=number; i++){
        factorial= factorial.multiply(BigInteger.valueOf(i));
        }
        
        System.out.println(factorial);
    }
    
}
