
package taxtrate;

import java.util.Scanner;

public class TaxtRate {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Number");
        int number=s.nextInt();
        
        double tax=0;
        
        if(number<=8350){
        tax=number*.10;
        }
        System.out.println(tax);
    }
    
}
