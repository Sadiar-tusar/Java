
package executordemothread;

public class PrintNum implements Runnable{
    
     private int lastNum;

    public PrintNum() {
    }

    public PrintNum(int lastNum) {
        this.lastNum = lastNum;
    }
     
     

    @Override
    public void run() {
        
        for(int i=0; i <= lastNum; i++){
        
            System.out.println(""+i);
        }
    }
     
     
}
