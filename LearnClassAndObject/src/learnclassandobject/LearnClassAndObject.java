
package learnclassandobject;

import java.util.Scanner;
import java.util.jar.Attributes;
import learnclassandobject.lclass.Circle;
import learnclassandobject.lclass.Student;


public class LearnClassAndObject {

   
    public static void main(String[] args) {
    
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter 1st Number");
        int firstNumber=s.nextInt();
        
        System.out.println("Enter 2nd Number");
        int secondNumber=s.nextInt();
        
        System.out.println("Enter 3rd Number");
        int thirdnumber=s.nextInt();
        
//        Circle circle=new Circle(5);
Circle c1=new Circle();
Circle c2=new Circle(3);
Circle c3=new Circle(4);
Circle c4=new Circle(5);

//        Student reja=new Student("Reja", 50);
//         Student atiq=new Student("Atiq", 30);
//          Student imran=new Student("imran", 60);
          
//           Student reja=new Student("Reja "+firstNumber);
//         Student atiq=new Student("Atiq "+secondNumber);
//          Student imran=new Student("imran "+thirdnumber);

Student reja=new Student("Reja");
Student atiq=new Student("Atiq");
Student imran=new Student("imran");
          
                  
          System.out.println(reja.getResult());
           System.out.println(atiq.getResult());
            System.out.println(imran.getResult());
            
          
        
//        System.out.println(circle.getArea());
//        System.out.println(circle.getPerimeter());
//        
//        circle.setRadius(2);
//        
//         System.out.println(circle.getArea());
//        System.out.println(circle.getPerimeter());
    }
    
}
