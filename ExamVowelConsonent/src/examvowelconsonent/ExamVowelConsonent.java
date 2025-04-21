
package examvowelconsonent;

import java.util.Scanner;

public class ExamVowelConsonent {

  
    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Charecter");
        char ch=s.next().toLowerCase().charAt(0);
        
        if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("It is Vowel");
        }
        else{
            System.out.println("It is Consonent");
        }
        
    }
    
}
