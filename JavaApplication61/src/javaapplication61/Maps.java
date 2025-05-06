
package javaapplication61;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import java.util.Set;
import javaapplication61.stu.Student;


public class Maps {
    
    public static void main(String[] args) {
        
//        Set<Student> sr=new HashSet<>();

        Map<Integer,Student> st=new HashMap<>();
        
//      st.put(1, new Student(123, "Atiq", "atiq@gmail.com"));

st.put(1, new Student(1, "A", "a"));
        st.put(2, new Student(2, "B", "b"));
        st.put(3, new Student(3, "C", "c"));
        st.put(4, new Student(4, "D", "d"));
      
        System.out.println(st);
        
        Iterator<Map.Entry<Integer,Student>> li=st.entrySet().iterator();
        
         
        while (li.hasNext()) {
            Map.Entry<Integer, Student> entry = li.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
