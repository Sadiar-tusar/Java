
package eventrycatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EvenTryCatch {

    
    public static void main(String[] args) {
       
        File s=new File("C:\\Users\\Admin\\Desktop\\even.txt");
        
        try {
            PrintWriter pw=new PrintWriter(s);
            
            for (int i = 1; i <= 50; i++) {
                if (i % 2==0) {
                    pw.print(i+",");
                }
            }
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EvenTryCatch.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
