//Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo().
// Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to
// calculate salary and display information for each role.


// Abstract class Employee
abstract class Employee {
    String name;
    int employeeId;

    // Constructor
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Abstract methods
    public abstract double calculateSalary();
    public abstract void displayInfo();
}

// Subclass Manager extending Employee
class Manager extends Employee {
    double salary;

    // Constructor
    public Manager(String name, int employeeId, double salary) {
        super(name, employeeId);
        this.salary = salary;
    }

    // Implementation of calculateSalary method for Manager
    @Override
    public double calculateSalary() {
        return salary;
    }

    // Implementation of displayInfo method for Manager
    @Override
    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Role: Manager");
        System.out.println("Salary: " + calculateSalary());
    }
}

// Subclass Programmer extending Employee
class Programmer extends Employee {
    double salary;

    // Constructor
    public Programmer(String name, int employeeId, double salary) {
        super(name, employeeId);
        this.salary = salary;
    }

    // Implementation of calculateSalary method for Programmer
    @Override
    public double calculateSalary() {
        return salary;
    }

    // Implementation of displayInfo method for Programmer
    @Override
    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Role: Programmer");
        System.out.println("Salary: " + calculateSalary());
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        // Create instances of Manager and Programmer
        Manager manager = new Manager("John Doe", 1001, 60000);
        Programmer programmer = new Programmer("Jane Smith", 1002, 50000);

        // Display information for Manager and Programmer
        System.out.println("Manager Details:");
        manager.displayInfo();

        System.out.println("\nProgrammer Details:");
        programmer.displayInfo();
    }
}