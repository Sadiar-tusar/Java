
package readdata;



import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadData {

   
    public static void main(String[] args) {
       
        try {
            URL u=new URL("https://www.google.com/index.html");
            Scanner s=new Scanner(u.openStream());
            
            //pattern to match html tags
            Pattern p=Pattern.compile("<[^>]+>");
            
            while(s.hasNext()){
            String st=s.nextLine();
            
                Matcher matcher=Pattern.matcher(st);
            }
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(ReadData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
