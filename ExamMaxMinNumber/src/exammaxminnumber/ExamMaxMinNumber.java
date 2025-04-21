
package exammaxminnumber;

import java.util.Scanner;


public class ExamMaxMinNumber {

    public static void main(String[] args) {
      
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Limit");
        int size=s.nextInt();
        
        int[] array=new int[size];
        
        int maxNumber=0;
        int minNumber=99999999;
        
        for(int i=0; i<size; i++){
            System.out.println("Enter Value");
        int userInput=s.nextInt();
        array[i]=userInput;
        
        }
        for(int number:array){
            
        if(number > maxNumber ){
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
