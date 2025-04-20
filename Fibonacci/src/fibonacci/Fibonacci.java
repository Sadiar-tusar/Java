
package fibonacci;

import java.util.Scanner;


public class Fibonacci {

    
    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Limit");
        int input=s.nextInt();
        
         System.out.println("---------");
        
         int n=0;
        int n1=1;
        int sum=0;
        
        System.out.println(n);
        System.out.println(n1);
        
       
          for(int i=3; i<=input; i++){
           sum=n+n1;
           
            n=n1;
            n1=sum;
              System.out.println(sum);
        }

    }
    
}
