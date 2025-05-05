
package newbanksystem.account;


public class CurrentAccount extends Account{
    
    private long overDraftLimit;

    public CurrentAccount() {
        
    }

    public CurrentAccount(long overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    public CurrentAccount(long overDraftLimit, long accountNumber, double balance) {
        super(accountNumber, balance);
        this.overDraftLimit = overDraftLimit;
    }

    public long getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(long overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdraw(double number) {
      
        double balance=super.getBalance();
        
       if(number>0 && balance+overDraftLimit >=number){
        
            balance -=number;
            super.setBalance(balance);
            
            System.out.println(number+"Withdraw Successfull(With Over Draft if Nedded).");
        }
        
        else{
            System.out.println("Withdrawal exceeds overdraft limit or invalid amount.");
        }
    }

    @Override
    public void printDatails() {
        super.printDatails();
        System.out.println("Over Draft Limit: "+overDraftLimit);
    }
    
    
    
    
    
}
