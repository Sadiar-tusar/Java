package checkleapyear;

import java.util.Scanner;

public class CheckLeapYear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = input.nextInt();
        if (n % 4 == 0) {
            if (n % 100 == 0) {
                if (n % 400 == 0) {
                    System.out.println(n + " is Leap Year");
                } else {
                    System.out.println(n + " is Not Leap Year");
                }
                
            }
            else{
                       System.out.println(n+" is Leap Year"); 
                        }
        }
        else{
            System.out.println(n+" is Not Leap Year");
        }
    }

}
