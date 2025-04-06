package javaapplication7;

import java.util.Scanner;

public class JavaApplication7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Radius: ");
        float radius = input.nextFloat();

        if (radius <= 0) {
//            System.out.println("Your Radius is Zero Or Negetive");
//            System.out.println("Enter Radius Again");
//            float newRadius = input.nextFloat();
//            double result = Math.PI * Math.pow(newRadius, 2);
//            System.out.println("Your Radius is: " + result);
            System.out.println("Your Input is Zero Or Negetive");
            System.out.println("Enter Input Again");
            float radius1 = input.nextFloat();
            float aria = radius1 * radius1 * 3.1416f;
            System.out.println(aria);
        } else {
//            double result1 = Math.PI * Math.pow(radius, 2);
//            System.out.println("Your Radius is: " + result1);

            float aria1 = radius * radius * 3.1416f;
            System.out.println(aria1);
        }

    }

}
