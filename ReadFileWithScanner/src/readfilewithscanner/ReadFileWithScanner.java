
package readfilewithscanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ReadFileWithScanner {

    
    public static void main(String[] args) {
       
       
        try {
             File file=new File("C:\\Users\\Admin\\Desktop\\sadiar.txt");
            Scanner s=new Scanner(file);
            System.out.println(s.nextLine());
            
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadFileWithScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         File file=new File("C:\\Users\\Admin\\Desktop\\sadiar.txt");
        try {
            Scanner s=new Scanner(file);
            System.out.println(s.nextLine());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadFileWithScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
