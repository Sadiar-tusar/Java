
package calculateposativenegetiveorzero;

import java.util.Scanner;


public class CalculatePosativeNegetiveorZero {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter Number");
        int posativeNegetiveZero=input.nextInt();
        
        if(posativeNegetiveZero > 0){
            System.out.println(posativeNegetiveZero+" is a Posative Number");
        }
        else if(posativeNegetiveZero < 0){
            System.out.println(posativeNegetiveZero+" is a Negetive number");
        }
        else{
            System.out.println(posativeNegetiveZero+" is Zero");
        }
        
    }
    
}
