
package methodmultiarray;

import java.util.Scanner;


public class MethodMultiArray {

   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Row Number");
        int rowNumber=s.nextInt();
        
        System.out.println("Enter Colum Number");
        int columNumber=s.nextInt();
        
        int[][] myArray=new int[rowNumber][columNumber];
        
        for(int row=0; row < myArray.length; row++){
            for(int col=0; col <myArray[row].length; col++){
                System.out.println("Enter Item Value");
                int userInput=s.nextInt();
                myArray[row][col]=userInput;
            }
        }
        
        System.out.println("---------------------");
        
      for(int row=0; row < myArray.length; row++){
            for(int col=0; col <myArray[row].length; col++){
                System.out.println(myArray[row][col]+"\t");
                
            }
            System.out.println("\n");
        }
    }
    
}
