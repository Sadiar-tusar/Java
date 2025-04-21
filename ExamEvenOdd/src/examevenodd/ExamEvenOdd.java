
package examevenodd;

import java.util.Scanner;


public class ExamEvenOdd {

   
    public static void main(String[] args) {
      
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Number");
        int number=s.nextInt();
        
        if(number % 2==0){
            System.out.println("This Number is Even");
        }
        else{
            System.out.println("This Number is Odd");
        }
    }
    
}
