
package newbubblesort;

import java.util.Arrays;
import java.util.Scanner;


public class NewBubbleSort {

   
    public static void main(String[] args) {
       
          Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Limit");
        int size = s.nextInt();
        
        int[] myArray = new int[size];
        
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter Value");
            int userInput = s.nextInt();
            myArray[i] = userInput;
        }
        
        System.out.println("---------");
        
        for (int i = 0; i < myArray.length - 1; i++) {
               for (int j = 0; j < myArray.length - i - 1; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(myArray));
    }
    
}
