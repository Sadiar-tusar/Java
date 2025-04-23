
package newclassobject;

import newclassobject.student.StudentNew;


public class NewClassObject {

    
    public static void main(String[] args) {
        StudentNew s=new StudentNew();
        
        s.setName("Atiq");
        s.setEmail("atiq@gmail.com");
        s.setMarks(50);
        s.setId(12345);
        s.setPasword(67865734);
        s.setAddress("Ajimpur, Dhaka");
        s.setInstituteName("Dhaka Univarsity");
        s.setNumber("01722652595");
        
        System.out.println(s);
        
        
    }
    
}
