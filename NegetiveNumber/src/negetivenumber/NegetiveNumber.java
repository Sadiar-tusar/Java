
package negetivenumber;

import java.util.Scanner;


public class NegetiveNumber {

    
    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        
        
        
        int sum=0;
        
        while(true){
            int number=s.nextInt();
        if(number<0){
        
        
            System.out.println("---------");  
            break;
                
        }
         sum +=number; 
        }
        
        System.out.println(sum);
    }
    
}
