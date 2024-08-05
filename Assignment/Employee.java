public class Employee {
    
    private String name;
    private String jobTitle;
    private double salary;

    
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

  
    public String getName() {
        return name;
    }

   
    public String getJobTitle() {
        return jobTitle;
    }

    
    public double getSalary() {
        return salary;
    }

   
    public void setSalary(double salary) {
        this.salary = salary;
    }

   
    public void applyRaise(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
            System.out.println("Salary updated to: " + salary);
        } else {
            System.out.println("Invalid percentage. Raise not applied.");
        }
    }

    
    public void printDetails() {
        System.out.println("Name: " + name + ", Job Title: " + jobTitle + ", Salary: " + salary);
    }

   
    public static void main(String[] args) {
       
        Employee employee = new Employee("Miraj Ali", "Software Engineer", 75000.00);

        
        employee.printDetails();

       
        employee.applyRaise(10);

        
        employee.printDetails();

       
        employee.setSalary(90000.00);

        
        employee.printDetails();
    }
}
