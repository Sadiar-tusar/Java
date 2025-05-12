
package abstractemployeeclass.employee;


public class FullTimeEmployee extends Employee{

  private double mounthlySalary;

    public FullTimeEmployee(double mounthlySalary) {
        this.mounthlySalary = mounthlySalary;
    }

    public FullTimeEmployee(double mounthlySalary, String employeeName, int employeeId) {
        super(employeeName, employeeId);
        this.mounthlySalary = mounthlySalary;
    }

  
  
    @Override
    public double calculateSalary() {
        
      return mounthlySalary;
        
    }

   
    
}
