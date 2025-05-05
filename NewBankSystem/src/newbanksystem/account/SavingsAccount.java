
package newbanksystem.account;


public class SavingsAccount extends Account{
    
    private float interestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(float interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(float interestRate, long accountNumber, double balance) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void printDatails() {
        super.printDatails(); 
        System.out.println("Interest rate: "+interestRate);
    }
    
    
    
}
