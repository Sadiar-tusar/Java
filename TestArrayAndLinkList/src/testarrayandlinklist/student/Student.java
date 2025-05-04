
package testarrayandlinklist.student;


public class Student {
    
     private String name;
   private String email;
   private double marks;
   private int id;
   private int pasword;
   private String address;
   private String instituteName;
   private long number;

    public Student() {
    }

    public Student(String name, String email, double marks, int id, int pasword, String address, String instituteName, long number) {
        this.name = name;
        this.email = email;
        this.marks = marks;
        this.id = id;
        this.pasword = pasword;
        this.address = address;
        this.instituteName = instituteName;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPasword() {
        return pasword;
    }

    public void setPasword(int pasword) {
        this.pasword = pasword;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }
   
   
}
