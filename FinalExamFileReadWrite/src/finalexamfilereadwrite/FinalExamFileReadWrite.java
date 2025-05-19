
package finalexamfilereadwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FinalExamFileReadWrite {

    public static void main(String[] args) {
       
        File file=new File("C:\\Users\\HP\\Desktop\\sadiarrahman.txt");
        
        try {
            
            PrintWriter pw=new PrintWriter(file);
            pw.append("I am a Student of Java Programming Language");
            pw.append("");
            pw.append("");
            pw.print("sadiar rahman");
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FinalExamFileReadWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Scanner s=new Scanner(file);
            while(s.hasNext()){
                System.out.println(s.nextLine());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FinalExamFileReadWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
