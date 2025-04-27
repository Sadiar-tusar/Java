package learnarraylist.student;

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

    public Student(String name, String email, double marks) {
        this.name = name;
        this.email = email;
        this.marks = marks;
    }

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public Student(String name, String email, int id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public Student(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
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

    public String getResult() {

        if (marks <= 33) {
            return name + " Fail " + marks;

        } else {
            return name + " Pass " + marks;
        }
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", email=" + email + ", marks=" + marks + ", id=" + id + ", pasword=" + pasword + ", address=" + address + ", instituteName=" + instituteName + ", number=" + number + '}';
    }
    
    
}
