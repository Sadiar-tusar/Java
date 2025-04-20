
package learnclassandobject.lclass;


public class Student {
    
    String name;
    String email;
    double marks;

    public Student() {
    }

    public Student(String name, String email, double marks) {
        this.name = name;
        this.email = email;
        this.marks = marks;
    }

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public Student(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
    
    
    
    
    public String getResult(){
    
        if(marks <= 33){
        return name+" Fail "+marks;
        
        }
        else{
        return name+" Pass "+marks;
        }
    }
}
