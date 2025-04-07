package checkvowelconsonent;

import java.util.Scanner;

public class CheckVowelConsonent {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        
//        System.out.println("Enter Charecter");
//        char ch = input.next().toLowerCase().charAt(0);
//        
//        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//            System.out.println(ch + " is Vowel");
//        } else {
//            System.out.println(ch + " is Consonat");
//        }
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Charecter");
        char ch = input.next().toLowerCase().charAt(0);
        
        if (Character.isLetter(ch)) {
            switch (ch) {
                case 'a':
                    System.out.println("It is Vowel");

                    break;
                case 'e':
                    System.out.println("It is Vowel");
                    break;
                case 'i':
                    System.out.println("It is Vowel");
                    break;
                case 'o':
                    System.out.println("It is Vowel");
                    break;
                case 'u':
                    System.out.println("It is Vowel");

                default:
                    System.out.println("It is Consonant");
            }
        } else {
            System.out.println("Invalid");
        }

    }

}
