
package lernscanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LernScanner {

    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\HP\\Desktop\\java.txt");
            Scanner s = new Scanner(f);
           
            //make array
            String text=s.nextLine();
            
            String[] myArray=text.split(" ");
//            System.out.println(s.nextLine());

            System.out.println(Arrays.toString(myArray));
        
//1 by 1 bottom   
           while(s.hasNext()){
               System.out.println(s.next());
           }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LernScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
