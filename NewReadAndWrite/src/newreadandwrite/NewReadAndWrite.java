
package newreadandwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NewReadAndWrite {

    
    public static void main(String[] args) {
      
        
        File file=new File("C:\\Users\\Admin\\Desktop\\document.txt");
        
        try {
            
            PrintWriter pw=new PrintWriter(file);
            
            pw.append("I am a Student of Java Programmer sjgdhkjhsdgkd \n ");
            pw.append("I am a Student of Java Programmer sjgdhkjhsdgkd \n kdfjfdhdifjhkjf.kjgfbhljf");
            pw.print("jhsghdghik");
            
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewReadAndWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
            Scanner s=new Scanner(
                    file);
            while(s.hasNext()){
                System.out.println(s.nextLine());
            
            }
            
          
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewReadAndWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
