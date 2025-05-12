
package lerncollections.stack;

import java.util.Stack;


public class TestStack {
    
    public static void main(String[] args) {
        
        Stack<String> names=new Stack<>();
        
        names.push("Atiq");
        names.push("Reza");
        names.push("Masud");
        names.push("Rakib");
        names.push("Rohim");
        
        System.out.println(names);
        
         System.out.println(names.search("Masud"));
         
          System.out.println(Float.floatToIntBits(2f));
         System.out.println(Float.floatToIntBits(100f));
         
          int hashCode = (int)(2 ^ (2 >> 32));
          
          System.out.println(hashCode);
        
        
    }
}
