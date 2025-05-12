
package newemployeeclass.employee;


public class Manager extends Employee{
    
    private int teamSize;

    public Manager() {
    }

    public Manager(int teamSize) {
        this.teamSize = teamSize;
    }

    public Manager(int teamSize, String name, int id, double salary) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    
     public void printDetails(){
         System.out.println("---Manager Details---");
         System.out.println("Name: "+super.getName());
         System.out.println("Id: "+super.getId());
         System.out.println("Salary: "+super.getSalary());
         System.out.println("Team Aize: "+teamSize);
     }
}
