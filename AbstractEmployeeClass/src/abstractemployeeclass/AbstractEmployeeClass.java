
package abstractemployeeclass;

import abstractemployeeclass.employee.Employee;
import abstractemployeeclass.employee.FullTimeEmployee;
import abstractemployeeclass.employee.PartTimeEmployee;


public class AbstractEmployeeClass {

    
    public static void main(String[] args) {
       
        
        Employee employee=new FullTimeEmployee(50000, "Reza", 12345);
        Employee em=new PartTimeEmployee(80,200 , "Rana", 98765);
        
        System.out.println(employee.getEmployeeName()+",s Mounthly Salary "+employee.calculateSalary());
        System.out.println(em.getEmployeeName()+",s Hourly Salary "+em.calculateSalary());

       
    }
    
}
