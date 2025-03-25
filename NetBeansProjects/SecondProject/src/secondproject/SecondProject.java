
package secondproject;
import java.util.Scanner;

public class SecondProject {

     public static void main(String[] args) {
//    Scanner scanner=new Scanner(System.in);
//         System.out.println("Enter Secound");
//         int totalSecond=scanner.nextInt();
//         int hours=totalSecond / 3600;
//         int remainngSeconds=totalSecond % 60;
//         int minutes=remainngSeconds / 60;
//         int seconds=remainngSeconds % 60;
//         
//         System.out.println(totalSecond+"second= "+hours+"hours, "+ minutes +"minutes, "+seconds+"seconds ");
Scanner scanner=new Scanner(System.in);
         System.out.println("Enter Radius");
         float radius=scanner.nextFloat();
         float area=(radius * radius) * 3.1416f;
         System.out.println("Aria= "+area);
    }
    
}
