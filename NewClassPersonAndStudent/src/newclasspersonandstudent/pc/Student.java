
package newclasspersonandstudent.pc;


public class Student extends PersonClass{
    
    private int studentId;

    public Student() {
    }

    public Student(int studentId) {
        this.studentId = studentId;
    }

    public Student(int studentId, String name, int age) {
        super(name, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public void displayPersonDetails() {
        super.displayPersonDetails(); 
        System.out.println("Student Id: "+studentId);
    }

    
    
    

//    @Override
//    public String toString() {
//        return "Student{" + "studentId=" + studentId + '}';
//    }
//    
    
}
