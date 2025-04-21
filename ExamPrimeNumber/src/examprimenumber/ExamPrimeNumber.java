
package examprimenumber;

import java.util.Scanner;


public class ExamPrimeNumber {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Number");
        int number=s.nextInt();
        
        int count=0;
        
        for(int i=1; i<=number; i++){
        if(number % i==0){
        count++;
        }
        }
        if(count==2){
            System.out.println("It is Prime Number");
        }
        else{
            System.out.println("It is Not Prime Number");
        }
    }
    
}
