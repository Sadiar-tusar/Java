
package nagadmobilebankingsystem.ac;


public class CashInAccount extends Account{
    
    private double newCash;

    public CashInAccount() {
    }

    public CashInAccount(double newCash) {
        this.newCash = newCash;
    }

    public CashInAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }
    
    
    
    

    public CashInAccount(double newCash, int accountNumber, double balance) {
        super(accountNumber, balance);
        this.newCash = newCash;
    }

    @Override
    public void cashIn(double number) {
        
        double balance=super.getBalance();
        
         if(number>0){
       
       balance+=number;
       
           System.out.println("Cash in Successfull");
             System.out.println("-----------\n");
           System.out.println("Your Balance is "+balance);
       }
       
       else{
           System.out.println("Cash In Invalid");
       }
         
    }

   

   

   
    
    
    
}
