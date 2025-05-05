
package multidimensionarray;


import java.util.Arrays;
import java.util.Scanner;


public class MultidimensionArray {

   
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Limit");
        int size=s.nextInt();
        
         int[] numbers=new int[size];
        
          for(int index=0; index < size; index++){
              
              System.out.println("Enter Number"+(index+1));
            int userInput=s.nextInt();
            numbers[index]=userInput;
             
          }
            
      
        
    }
    
}
