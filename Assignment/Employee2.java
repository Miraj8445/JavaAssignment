import java.time.LocalDate;
import java.time.Period;

public class Employee2 {
    
    private String name;
    private double salary;
    private LocalDate hireDate;

    
    public Employee2(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    
    public String getName() {
        return name;
    }

    
    public double getSalary() {
        return salary;
    }

    
    public LocalDate getHireDate() {
        return hireDate;
    }

    
    public int calculateYearsOfService() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(hireDate, currentDate).getYears();
    }

    
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: Rupees = " + salary);
        System.out.println("Hire Date: " + hireDate);
        System.out.println("Years of Service: " + calculateYearsOfService());
    }

    public static void main(String[] args) {
       
        Employee2 employee = new Employee2("Miraj Ali", 1200000, LocalDate.of(2020, 11, 8));

        
        employee.printDetails();
    }
}
