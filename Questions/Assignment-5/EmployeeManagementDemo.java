class Employee {
    private String name;
    private double salary;
    private String department;

    // Constructor to initialize name and salary
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.department = "Not Assigned"; // Default department
    }

    // Overloaded constructor to initialize name, salary, and department
    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Salary: " + salary + ", Department: " + department);
    }
}

class EmployeeManagementSystem {
    private Employee[] employees;
    private int count;

    // Constructor to initialize the array and count
    public EmployeeManagementSystem(int size) {
        employees = new Employee[size];
        count = 0;
    }

    // Method to add an employee with only name and salary
    public void addEmployee(String name, double salary) {
        employees[count++] = new Employee(name, salary);
    }

    // Overloaded method to add an employee with name, salary, and department
    public void addEmployee(String name, double salary, String department) {
        employees[count++] = new Employee(name, salary, department);
    }

    // Method to display all employees
    public void displayAllEmployees() {
        for (int i = 0; i < count; i++) {
            employees[i].displayDetails();
        }
    }
}

public class EmployeeManagementDemo {
    public static void main(String[] args) {
        // Create an instance of EmployeeManagementSystem with a fixed size
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);

        // Add employees
        ems.addEmployee("Alice", 50000);
        ems.addEmployee("Bob", 60000, "IT");

        // Display all employees
        ems.displayAllEmployees();
    }
}
