
package examthread64;

public class ExamThread64 {

    public static void main(String[] args) {
       
        Runnable printA=new PrintChar('a', 100);
        Runnable printB=new PrintChar('b', 100);
        
        Runnable print100=new PrintNum(100);
        
        //Creat Threat
        Thread tread1=new Thread(printA);
        Thread tread2=new Thread(printB);
        Thread tread3=new Thread(print100);
        
        //Start Threat
        tread1.start();
        tread2.start();
        tread3.start();
    }
    
}
