
package roughpapergame;

import java.util.Random;
import java.util.Scanner;


public class RoughPaperGame {

    
    public static void main(String[] args) {
      System.out.println("Enter NUmber 0 For Rock, Enter Number 1 		  For Scissor, Enter Number 2 For Paper");        	System.out.println("Enter Your Number");         
Scanner sc = new Scanner(System.in);         
int number = sc.nextInt();  
        
Random rd = new Random();         
int random = rd.nextInt(2);         
System.out.println("Computer Number = " + random);  
        
switch (number) 
        { 
            case 0: 
                if (number == 1) 
                { 
                    System.out.println("You Win");                } 
                else if(random == 2) 
                { 
                    System.out.println("Computer Win");                } 
                else                { 
                    System.out.println("Match Draw");                } 
            case 1: 
                if (number == 0) 
                { 
                    System.out.println("computer Win");                } 
                else if(random == 2) 
                { 
                    System.out.println("You Win");                } 
                else                { 
                    System.out.println("Match Draw");                } 
                break;            case 2: 
                if (number == 1) 
                { 
                    System.out.println("Coumpter Win");                } 
                else if(random == 0) 
                { 
                    System.out.println("You Win");                } 
                else { 
                    System.out.println("Match Draw");                } 
                break;        } 
    }
    
}
