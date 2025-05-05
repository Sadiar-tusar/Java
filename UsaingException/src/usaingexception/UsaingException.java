
package usaingexception;


public class UsaingException {

    
    public static void main(String[] args) {
       
        try{
        int a=10;
        int b=0;
        int result=a/b;
        
        System.out.println(result);
    }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
