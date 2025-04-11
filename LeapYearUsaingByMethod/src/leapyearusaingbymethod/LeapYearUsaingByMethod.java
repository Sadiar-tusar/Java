
package leapyearusaingbymethod;

import java.util.Scanner;


public class LeapYearUsaingByMethod {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter input");
        int input=s.nextInt();
        
        String result=leapYear(input);
        System.out.println(result);
    }
    
    public static String leapYear(int input){
        
        String result="";
        
    if(input % 400==0 || (input % 4==0 && input % 100 !=0)){
    result=input+" is Leap Year";
    }
    else{
    result=input+" is Not Leap Year";
    }
    
    return result;
    }
    
}
