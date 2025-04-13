
package usernameandpasswordmatching;

import java.util.Scanner;


public class UserNameAndPasswordMatching {

   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENter ur username ");
          String userName = s.next();
        
      
        String[] names= {"Atiq","Rohim","Rana"};
        int[] passwords={100,200,300};
        
        for(int i=0; i <names.length; i++){
            
        if(userName.equalsIgnoreCase(names[i])){
            
            System.out.println("Enter your Password ");            
            int userPassword =s.nextInt();
            
            if(userPassword == passwords[i]){
                System.out.println("Welcome you " + userName);
            }
            else{
                System.out.println("The Password is incorrect");
            }
         
        }
//        else{
//            System.out.println("Ur User Name is Incorrect");
//        }
//         
        
        }
        
        
    }
    
}
