
package newmaxmin;

import java.util.Scanner;


public class NewMaxMin {

    public static void main(String[] args) {
      
         Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Limit");
        int size=s.nextInt();
        
        int[] numbers=new int[size];
        
        int maxNumber=0;
        int minNumber=999999;
        
        for(int i=0; i<size;i++){
            System.out.println("Enter Value");
            int userInput=s.nextInt();
            numbers[i]=userInput;
            
        }
        
        for(int number : numbers){
        if(number > maxNumber){
        maxNumber=number;
        }
        if(number < minNumber){
        minNumber=number;
        }
        }
        
        System.out.println("Max Number is "+maxNumber);
         System.out.println("Min Number is "+minNumber);
        
    }
    
}
