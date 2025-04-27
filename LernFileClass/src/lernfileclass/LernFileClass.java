package lernfileclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LernFileClass {

    public static void main(String[] args) {

//        File f=new File("C:\\Users\\Admin\\Desktop\\java.txt");
//        
//        System.out.println(f.exists());
//        
//        
//            
//        try {
//            PrintWriter pw = new PrintWriter(f);
//             pw.append(" Bro Kamon achen?");
//            pw.print(" Bangla mal anbo?");
//            
//            pw.close();
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(LernFileClass.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
        File f = new File("C:\\Users\\Admin\\Desktop\\even.txt");
        
        Scanner n=new Scanner(System.in);
        
        System.out.println("Enter Limit");
        int userInput=n.nextInt();

//int input=50;
//for(int i=1; i<=input; i++){
//  if(input % 2==0){
//            
//        }
        try {

            PrintWriter pw = new PrintWriter(f);
            for (int i = 1; i <= userInput; i++) {
                if (i % 2 == 0) {
                    pw.print(i+",");

                }

            }

            pw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LernFileClass.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
