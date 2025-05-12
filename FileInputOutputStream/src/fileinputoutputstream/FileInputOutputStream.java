
package fileinputoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileInputOutputStream {

    
    public static void main(String[] args) {
      
        try {
            FileOutputStream fos=new FileOutputStream("java.dat");
            
            fos.write(10);
            fos.write(20);
            fos.write(50);
            
            fos.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileInputOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileInputOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream fis=new FileInputStream("java.dat");
            
            int value;
            while((value=fis.read()) !=-1 ){
            
                 System.out.println(value);
            }
            
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileInputOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileInputOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
