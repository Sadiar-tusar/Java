
package examtestexception;


public class ExamTestException {

    
    public static void main(String[] args) {
      
        
        try {
            // Code that may throw an exception
            int a = 10;
            int b = 0;
            int result = a / b;  // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            // This block always runs
            System.out.println("Execution completed.");
        }
    }
}

    
    

