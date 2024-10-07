import java.util.Scanner;

class Employee {
    // Data members
    private String employeeID;
    private String name;
    private String department;
    private double salary;

    // Method to set employee details
    public void setEmployeeDetails(String employeeID, String name, String department, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }

    // Method to calculate salary increase (For simplicity, it increases the salary by a percentage)
    public void updateSalary(double percentage) {
        if (percentage > 0) {
            salary += (salary * percentage / 100);
            System.out.println("Salary updated! New Salary: $" + salary);
        } else {
            System.out.println("Invalid percentage increase. Salary remains unchanged.");
        }
    }

    // Method to return current salary
    public double getSalary() {
        return salary;
    }
}

public class EmployeePayrollManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an Employee object
        Employee emp = new Employee();

        // Input employee details
        System.out.print("Enter Employee ID: ");
        String empID = scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        // Set employee details
        emp.setEmployeeDetails(empID, name, department, salary);

        int choice;
        do {
            // Display menu
            System.out.println("\nEmployee Payroll Management System");
            System.out.println("1. Display Employee Details");
            System.out.println("2. Update Salary");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    emp.displayEmployeeDetails();
                    break;
                case 2:
                    System.out.print("Enter percentage increase for salary: ");
                    double percentage = scanner.nextDouble();
                    emp.updateSalary(percentage);
                    break;
                case 3:
                    System.out.println("Exiting Payroll Management System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
