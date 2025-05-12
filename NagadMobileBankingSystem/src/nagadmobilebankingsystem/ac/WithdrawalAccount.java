
package nagadmobilebankingsystem.ac;

public class WithdrawalAccount extends Account{
    
    private double amount;
    private float charge;

    public WithdrawalAccount() {
    }

    public WithdrawalAccount(double amount, float charge) {
        this.amount = amount;
        this.charge = charge;
    }

    public WithdrawalAccount(double amount, float charge, int accountNumber, double balance) {
        super(accountNumber, balance);
        this.amount = amount;
        this.charge = charge;
    }

    @Override
    public void cashOut(double number) {
      
        double balance=super.getBalance();
        
         if(number>0 && balance+amount>=number){
        
           balance=(balance+charge)-number;
            super.setBalance(balance);
            
             System.out.println("Cash Out Charge 20 TK");
            
            System.out.println("Cash Out Successfull ");
        }
        
        else{
            System.out.println("Insuficient Balance");
        }
    }
}
