package examfactorial;

import java.util.Scanner;


public class ExamFactorial {

    
    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter number");
        int number=s.nextInt();
        
        int factorial=1;
        
        for(int i=1; i<=number; i++){
        factorial *=i;
        }
        
        System.out.println(number+"Factorial is "+factorial);
    }
    
}
