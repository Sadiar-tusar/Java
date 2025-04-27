
package numta;

import java.util.Scanner;


public class Numta {

    
    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        
        int userInput=s.nextInt();
        
        for(int i=1; i <=10; i++ ){
       int result=userInput*i;
            System.out.println(userInput+"*"+i+"="+result);
        }
    }
    
}
