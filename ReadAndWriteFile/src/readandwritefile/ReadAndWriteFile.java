
package readandwritefile;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ReadAndWriteFile {

    
    public static void main(String[] args) {
        File file=new File("C:\\Users\\Admin\\Desktop\\document.txt");
       
        try {
            Scanner s=new Scanner(file);
            System.out.println(s.nextLine());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadAndWriteFile.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
       
    }
    
}
