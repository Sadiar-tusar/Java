
package lernmethodoverloading;

import java.util.Arrays;
import java.util.Scanner;


public class LernMethodOverLoading {

   
    public static void main(String[] args) {
        
//        int result=sum();
//        System.out.println(""+result);
//sum(12,23,24,34,50);
Scanner s=new Scanner(System.in);
        System.out.println("Enter Number Limit");
        int n=s.nextInt();
        
        int[] myArray=new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter Number");
            int userInput=s.nextInt();
            myArray[i]=userInput;
        }
        
        sum(myArray);
        
    }
    
    public static int sum(){
    
        return 10+20;
    }
    
    public static int sum(int a){
    
        return 10+a;
    }
    public static int sum(int a,int b){
    
        return b+a;
    }
    
    public static void sum(int...a){
     int sum=0;
     
     for(int item:a){
         sum +=item;
     }
        System.out.println(Arrays.toString(a));
        System.out.println(sum);
    }
        
    
}
