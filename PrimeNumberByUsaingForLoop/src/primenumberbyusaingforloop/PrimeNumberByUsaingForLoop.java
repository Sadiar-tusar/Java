
package primenumberbyusaingforloop;

import java.util.Scanner;


public class PrimeNumberByUsaingForLoop {

  
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Number");
        int input=s.nextInt();
        
        int count=0;
        
        for(int i=1; i<=input; i++){
        if(input % i == 0){
        count++;
        }
      
        }
        
         if(count == 2){
            System.out.println(input+" It is Prime Number");
        }
         else{
             System.out.println(input+" It is Not Prime Number");
         }
    }
    
}
