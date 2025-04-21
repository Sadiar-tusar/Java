package maxminnumbernew;

import java.util.Scanner;

public class MaxMinNumberNew {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Limit");
        int size = s.nextInt();

        int[] arry = new int[size];

        int maxNumber = 0;
        int minNumber = 99999999;

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Value");
            int userInput = s.nextInt();
            arry[i] = userInput;
        }

        for (int number : arry) {
            if (number > maxNumber) {
                maxNumber = number;
            }

            if (number < minNumber) {
                minNumber = number;
            }
        }

        System.out.println("Max Number is " + maxNumber);
        System.out.println("Min Number is " + minNumber);
    }

}
