
package readdatafromweb;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ReadDataFromWeb {

    
    public static void main(String[] args) {
       
        
        
        try {
            URL url=new URL("https://www.google.com/index.html");
            
            Scanner s=new Scanner(url.openStream());
            
            System.out.println(s.nextLine());
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(ReadDataFromWeb.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadDataFromWeb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
    }
    
}
