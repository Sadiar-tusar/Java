
package methodlogicaltest;

import java.util.Arrays;
import java.util.Scanner;


public class MethodLogicalTest {

   
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Limit");
        int size=s.nextInt();
        
        String result=test(numbers);
        
//        int[] numbers=new int[size];
        
       
        
        
      
       
    }
    
    public static String test(int...numbers){
        
          for(int index=0; index < size; index++){
            System.out.println("Enter Number"+(index+1));
            int userInput=s.nextInt();
            numbers[index]=userInput;
          
        }
        
         int maxNumber=0;
        int minNumber=999999;
    
        String result="";
        for(int number : numbers){
        
            if(number > maxNumber){
            maxNumber=number;
            }
            if(number < minNumber){
            minNumber=number;
            }
            return result;
        }
    }
    
}
