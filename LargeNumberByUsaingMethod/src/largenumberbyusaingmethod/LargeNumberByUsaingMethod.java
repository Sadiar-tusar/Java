
package largenumberbyusaingmethod;

import java.util.Scanner;


public class LargeNumberByUsaingMethod {

   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=s.nextInt();
        System.out.println("Enter num2");
        int num2=s.nextInt();
        String result=largeNumber(num1,num2);
        System.out.println(""+result);
    }
    
    public static String largeNumber(int num1, int num2){
        
        String result="";
    if(num1 > num2){
    result=num1+" is Large Number";
    }
    else{
    result=num2+" is Large Number";
    }
    return result;
    }
    
}
