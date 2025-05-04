
package newclasspersonandstudent;

import newclasspersonandstudent.pc.Student;


public class NewClassPersonAndStudent {

    
    public static void main(String[] args) {
       
        Student student=new Student();
        
        student.setAge(30);
        student.setName("Reza");
        student.setStudentId(1234);
        
        student.displayPersonDetails();
        
       
        
    }
    
}
