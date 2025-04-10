package primenumber;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter Number");
//        int num=s.nextInt();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number");
        int input = s.nextInt();
        String result=oddOrEven(input);

       
        System.out.println(result);

//        String result=findPrimeNumber(num);
//        
//        System.out.println(findPrimeNumber(num));
    }

//    public static String findPrimeNumber(int num){
//         int count=0;
//         String result="";
//          for(int i=1; i<=num; i++){
//        if(num % i == 0){
//        count++;
//        }
//    }
//          if(count ==2){
//          result="It is Prime Number";
//          }
//          else{
//          result="It is Not Prime Number";
//          }
//          
//          
//          return result;
//      
//    
//    }
    public static String oddOrEven(int input) {
        
 String result = "";
 
        if (input % 2 == 0) {
            result = "This Number is Even";
        } else {
            result = "This Number is Odd";
        }
        
        return result;
    }

}
