
package factorianew;

import java.util.Scanner;


public class FactoriaNew {

    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Number");
        int number=s.nextInt();
        
        int factoria=1;
        
        for(int i=1; i<=number; i++){
        factoria *=i;
        }
        
        System.out.println(factoria);
    }
    
}
