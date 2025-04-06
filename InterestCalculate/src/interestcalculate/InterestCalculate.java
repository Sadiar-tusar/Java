
package interestcalculate;

import java.util.Scanner;


public class InterestCalculate {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Interest rate as 12.5%");
        
        double interestRate=s.nextDouble();
        double monthlyInterestRate=interestRate / 1200;
        
        System.out.println("Enter Number of Years");
        int numberofYears=s.nextInt();
        
        System.out.println("Enter Loan Amount");
        double loanAmount=s.nextDouble();
        
        double monthlyPayment=loanAmount * monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate,numberofYears * 12));
        double totalPayment=monthlyPayment * numberofYears * 12;
        
        System.out.println("The Monthly Payment is $"+(int)monthlyPayment);
        System.out.println("The Total Payment is $"+(int)totalPayment);
    }
    
}
