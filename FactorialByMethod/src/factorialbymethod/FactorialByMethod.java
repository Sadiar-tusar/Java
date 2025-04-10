package factorialbymethod;

import java.util.Scanner;

public class FactorialByMethod {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value");
        int input = s.nextInt();
        String result = factorial(input);
        System.out.println(result);

    }

    public static String factorial(int input) {
        String result = "";
        int count = 1;
        long factorial = 1;

        if (input < 0) {
            result = "Enter Positive Number";
        }
        else {
            do {
                long finalResult = factorial *= count;
                count++;
                result = finalResult + "";
            } while (count <= input);
        }
        
        return result;
    }

}
