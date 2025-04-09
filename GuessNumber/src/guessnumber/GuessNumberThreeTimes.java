package guessnumber;

import java.util.Scanner;

public class GuessNumberThreeTimes {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter ur Guess Number");

        int userNumber = s.nextInt();

        int randomNumber = (int) (Math.random() * 101);
        System.out.println(randomNumber);

        int count = 1;

        while (count < 3) {
            if (randomNumber == userNumber) {
                System.out.println("You Win");
                break;
            } else if (randomNumber < userNumber) {
                System.out.println("Your Input Higher Number");
                System.out.println("-------------------");
                System.out.println("Enter Your Guess Number");
                userNumber = s.nextInt();
            } else if (randomNumber > userNumber) {
                System.out.println("Your Input Lower Number");
                System.out.println("-------------------");
                System.out.println("Enter Your Guess Number");
                userNumber = s.nextInt();
            }

            if (count == 2) {
                System.out.println("Better Luck Next Time");
            }

            count++;
        }
    }

}
