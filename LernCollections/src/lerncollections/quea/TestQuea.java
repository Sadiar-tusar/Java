
package lerncollections.quea;

import java.util.LinkedList;
import java.util.Queue;


public class TestQuea {
    
    public static void main(String[] args) {
        
        Queue<Integer> number=new LinkedList<>();
        
        number.offer(6);
        number.offer(7);
        number.offer(8);
        number.offer(9);
        number.offer(10);
        
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        
        System.out.println(number);
        
        System.out.println(number);
        
        number.remove(10);
        System.out.println(number);
        
        number.poll(); // remove 1st number
        System.out.println(number);
    }
}
