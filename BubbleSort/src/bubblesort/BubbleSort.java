
package bubblesort;

import java.util.Arrays;
import java.util.Scanner;


public class BubbleSort {

   
    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Size");
        int size=s.nextInt();
        
        int[] myArray=new int[size];
        
        for(int index=0; index < myArray.length; index++){
            System.out.println("Enter Value");
            int userInput=s.nextInt();
            myArray[index]=userInput;
            
        }
        System.out.println("-----------------");
        System.out.println("Before Sorting "+Arrays.toString(myArray));
        
        for(int i=0; i<myArray.length-1; i++){
            for(int j=0; j< myArray.length-i-1; j++){
                if(myArray[j] > myArray[j+1]){
                int temp=myArray[j];
                myArray[j]=myArray[j+1];
                myArray[j+1]=temp;
                }
            }
        }
         System.out.println("After Sorting "+Arrays.toString(myArray));
        
       
        
    }
    
}
