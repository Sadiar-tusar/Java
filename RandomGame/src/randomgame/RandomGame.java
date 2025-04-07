
package randomgame;

import java.util.Scanner;


public class RandomGame {

   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Number");
        int number=s.nextInt();
        
        int random=(int)(Math.random()*10);
        System.out.println(random);
        
        if(number==random){
            System.out.println("You are Win");
        }
        else{
            System.out.println("You are Lose");
        }
    }
    
}
