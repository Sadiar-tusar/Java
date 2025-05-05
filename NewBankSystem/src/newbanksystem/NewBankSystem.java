
package newbanksystem;

import newbanksystem.account.CurrentAccount;
import newbanksystem.account.SavingsAccount;


public class NewBankSystem {

    
    public static void main(String[] args) {
       
        SavingsAccount sa=new SavingsAccount(3.5f, 123456, 500);
        
         System.out.println("Savings Account Details:");
        sa.printDatails();
        sa.deposit(5000);
        sa.withdraw(2000);
        sa.printDatails();
        
         System.out.println("\n------------------------\n");
         
         CurrentAccount ca=new CurrentAccount(1000, 987654, 3000);
         
         System.out.println("Current Account Details:");
        ca.printDatails();
        ca.deposit(500);
        ca.withdraw(4000); // Testing overdraft
        ca.printDatails();
    }
    
}
