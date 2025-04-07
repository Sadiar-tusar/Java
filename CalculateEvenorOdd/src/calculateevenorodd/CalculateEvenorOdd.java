package calculateevenorodd;

import java.util.Scanner;

public class CalculateEvenorOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int evenOdd = input.nextInt();
        if (evenOdd % 2 == 0) {
            System.out.println("This Number is Even");
        } else {
            System.out.println("This Number is Odd");
        }

    }

}
