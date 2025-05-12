
package abstractemployeeclass.employee;

public class PartTimeEmployee extends Employee{

    private double worksHour;
    private double hourlySalary;

    public PartTimeEmployee(double worksHour, double hourlySalary) {
        this.worksHour = worksHour;
        this.hourlySalary = hourlySalary;
    }

    public PartTimeEmployee(double worksHour, double hourlySalary, String employeeName, int employeeId) {
        super(employeeName, employeeId);
        this.worksHour = worksHour;
        this.hourlySalary = hourlySalary;
    }

    
    
    @Override
    public double calculateSalary() {
        
        return hourlySalary * worksHour;
        
    }
    
   

   
    
    
}
