
package lernscanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LernScanner {

    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\HP\\Desktop\\java.txt");
            Scanner s = new Scanner(f);
            System.out.println(s.nextLine());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LernScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
