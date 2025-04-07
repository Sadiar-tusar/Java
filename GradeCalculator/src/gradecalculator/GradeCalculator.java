
package gradecalculator;

import java.util.Scanner;


public class GradeCalculator {

  
    public static void main(String[] args) {
        Scanner marks=new Scanner(System.in);
        System.out.println("Enter Number");
        int number=marks.nextInt();
        if(number > 100){
            System.out.println("This Number is Invalid ");
        }
            else if(number >= 90){
                    System.out.println(number+" is Grage A");
                    }
            else if(number >=  80){
            System.out.println(number+" is Grade B");
            }
            else if(number >= 70){
                System.out.println(number+" is Grade c");
            }
            else if(number >= 60){
                System.out.println(number+" is Grade D");
                
            }
            else if(number <60){
            System.out.println(number+" is Grade F");
            }
        
    }
    
}
