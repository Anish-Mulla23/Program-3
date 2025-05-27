public class Employee extends Person {
    private String empId;
    private double salary;
public Employee(String name, String dobStr, String empId, double salary) {
        super(name, dobStr);
        this.empId = empId;
        this.salary = salary;
    }
    public void displayEmployeeDetails() {
        displayName();
        displayAge();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Anish", "25-11-2005", "EMP001", 55000);
        emp.displayEmployeeDetails();
    }
}
