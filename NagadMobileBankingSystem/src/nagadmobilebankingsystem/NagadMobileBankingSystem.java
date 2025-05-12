package nagadmobilebankingsystem;

import java.util.Scanner;
import nagadmobilebankingsystem.ac.CashInAccount;
import nagadmobilebankingsystem.ac.WithdrawalAccount;

public class NagadMobileBankingSystem {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("What do u Want, Cash in Press 1 Or Cash Out Press 2");
        int cashIn = s.nextInt();

//        int userInput=s.nextInt();
        if (cashIn == 1 || cashIn != 2) {

            System.out.println("Enter Your Account Number");
            int number = s.nextInt();
            int account = 5060;
            if (account != number) {

                System.out.println("Invalid Account Number");
                System.out.println("Enter Write Account Number");
                int number1 = s.nextInt();
            } else {

            }
            System.out.println("Enter Cash In Amount");
            double amount1 = s.nextDouble();

            CashInAccount ca = new CashInAccount(account, 500);
            ca.cashIn(amount1);

        } else if (cashIn == 2 || cashIn != 1) {
            System.out.println("Enter Your amount");
 double amount=s.nextDouble();
        WithdrawalAccount wa=new WithdrawalAccount(amount, 20, 5060, 500);
        wa.cashOut(amount);
        }

       
    }

}
