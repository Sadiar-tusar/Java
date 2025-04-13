
package lernsinglearray;

import java.util.Arrays;
import java.util.Scanner;


public class LernSingleArray {

  
    public static void main(String[] args) {
     
//        String[] names=new String[14];
//        
//        int[] age={10,0,13};
//        
//        String[] newNames={"Rohim, Atiq"};
//        System.out.println(Arrays.toString(names));
//        System.out.println(Arrays.toString(age));
//        System.out.println(Arrays.toString(newNames));
//        
//        names[0]="Sadiar";
//        names[5]="Rahamt Ullah";
//        
//        System.out.println(names);

        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Number Limit");
        int input=s.nextInt();
        
        String[] names=new String[input];
        int[] marks=new int[input];
        
        for(int i=0; i<marks.length; i++){
            System.out.println("Enter Value Name");
            String name=s.next();
            names[i]=name;
            
            System.out.println("Enter Value Marks");
            int mark=s.nextInt();
            marks[i] = mark;
        }
        
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(marks));

       
//      String[]  names= new String[5];
       
        
//        names[0]="Sadiar";
//        names[1]="Rohim";
//        names[2]="Istiaq";
//        names[3]="Rahamt";
//        names[4]="Eiasin";
        
           for (int i =0; i < names.length; i++){
               System.out.println(names[i]+ " is got "+ marks[i] );
//           
           }

        
      
    }
    
}
