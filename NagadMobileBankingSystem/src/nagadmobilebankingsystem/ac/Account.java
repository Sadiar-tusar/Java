
package nagadmobilebankingsystem.ac;


public class Account {
    
    private int accountNumber;
    private double balance;

    public Account() {
    }

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void cashIn(double number){
    
      
    }
    
    public void cashOut(double number){
    
        if(number>0 && balance>=number){
            
        balance-=number;
        }
        else{
            System.out.println("Insuficient Balance");
        }
    }
}
