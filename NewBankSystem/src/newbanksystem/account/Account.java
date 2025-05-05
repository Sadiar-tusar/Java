
package newbanksystem.account;

import java.awt.Color;


public class Account {
    
    private long accountNumber;
    double balance;

    public Account() {
    }

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public  void deposit(double number){
    
        if(number>0){
        balance+=number;
        System.out.println(number+"Successfully Deposite");
        }
        
        else{
            System.out.println("Invalid Deposite");
        }
        
        
    }
    
    public void withdraw(double number){
    
        if(number>0 && balance>=number){
        
            balance -=number;
            
            System.out.println(number+"Withdraw Successfull");
        }
        
        else{
            System.out.println("Insuficient Balance");
        }
    }
    
    public  void printDatails(){
    
        System.out.println("Account Number: "+accountNumber);  
        System.out.println("Balance: "+balance);
    }
    
    
}
