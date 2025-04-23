package newclassobject;

import java.util.Arrays;
import newclassobject.student.StudentNew;

public class NewClassObject {

    public static void main(String[] args) {
        
//        Array Of Object start--
StudentNew[] st=new StudentNew[5];

StudentNew s1=new StudentNew("Rana", 60);
StudentNew s2=new StudentNew("istiaq", 50);
StudentNew s3=new StudentNew("Halima", 40);
StudentNew s4=new StudentNew("Rohim", 65);

st[0]=s1;
st[1]=s2;
st[2]=s3;
st[3]=s4;


        System.out.println(Arrays.toString(st));
//        Array of Object end---
        
<<<<<<< HEAD
        System.out.println(s);
        
        
=======
//        StudentNew s=new StudentNew();

//        s.setName("Atiq");
//        s.setEmail("atiq@gmail.com");
//        s.setMarks(50);
//        s.setId(12345);
//        s.setPasword(67865734);
//        s.setAddress("Ajimpur, Dhaka");
//        s.setInstituteName("Dhaka Univarsity");
//        s.setNumber("01722652595");
////        
//        System.out.println(s);
//        StudentNew reja = new StudentNew("Reja", 60);
//        System.out.println(reja.getMarks());
//
//        System.out.println(reja.getResult());
        

//public static void ar jonno.
//StudentNew lowerMethod=new StudentNew(); 
//
//lowerMethod.setName("Eiasin");
//lowerMethod.setId(1236564);
//
//        printStudentDetails(lowerMethod);
>>>>>>> 143b65826b3f4883ce34df568b61cc0dbeb756c5
    }

//    public static void printStudentDetails(StudentNew sn) {
//
//        System.out.println("Name: " + sn.getName() + "\n" + "Id: " + sn.getId());
//    }

}
