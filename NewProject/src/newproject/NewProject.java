
package newproject;

import java.util.Scanner;


public class NewProject {

   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Year");
        String year=s.next();
       
        
        System.out.println("Enter Month");
        String month=s.next();
        
        System.out.println("Enter Date");
        String date=s.next();
        
        System.out.println(month+","+date+","+year);
//         System.out.println(month.concat(date).concat(year));
        
        
//        System.out.println("Enter User Number");
//        String userName=s.next();
      
//       System.out.println(userName.concat( " Programmer"));



    }
    
}
