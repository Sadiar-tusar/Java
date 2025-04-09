
package usecontinuebyforloop;


public class UseContinueByForLoop {

   
    public static void main(String[] args) {
       int targetValue=50;
       int count;
       
       for(count=1; count<=targetValue; count++ ){
          if(count % 15 !=0){
         System.out.println(""+count);
          
          }
       }
        
        
    }
    
}
