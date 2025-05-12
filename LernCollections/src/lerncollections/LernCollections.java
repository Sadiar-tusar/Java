
package lerncollections;

import java.util.Arrays;
import java.util.Collections;

import java.util.List;
import java.util.Random;


public class LernCollections {

   
    public static void main(String[] args) {
       
        List<String> list1=Arrays.asList("Red","Green","Blue","Orange");
        List<String> list2=Arrays.asList("Red","Green","Blue","Orange");
        
        Collections.shuffle(list1);
        Collections.shuffle(list2, new Random(2));
        
        System.out.println(list1);
        System.out.println(list2);
       
    }
    
}
