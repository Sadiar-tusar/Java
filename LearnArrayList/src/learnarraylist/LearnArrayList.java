
package learnarraylist;

import java.util.ArrayList;
import learnarraylist.student.Student;


public class LearnArrayList {

    
    public static void main(String[] args) {
       
        ArrayList<Student> studentList=new ArrayList<>();
        
        studentList.add(new Student("A", "sadiar@gmail.com", 900));
        studentList.add(new Student("B", "atiq@gmail.com", 800));
        studentList.add(new Student("C", "eiasin@gmail.com", 890));
        studentList.add(new Student("D", "istiaq@gmail.com", 880));
        
//        System.out.println(studentList);
        
        for(Student s:studentList){
            System.out.println(s);
        }
        
    }
    
}
