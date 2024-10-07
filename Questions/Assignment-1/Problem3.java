import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu
            System.out.println("Menu:");
            System.out.println("1. Perform Arithmetic Operations");
            System.out.println("2. Calculate Area and Perimeter of a Rectangle");
            System.out.println("3. Solve a Quadratic Equation");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Arithmetic Operations
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    System.out.println("1. Addition");
                    System.out.println("2. Subtraction");
                    System.out.println("3. Multiplication");
                    System.out.println("4. Division");
                    System.out.print("Choose an operation: ");
                    int operation = scanner.nextInt();

                    switch (operation) {
                        case 1:
                            System.out.printf("Result: %.2f%n", num1 + num2);
                            break;
                        case 2:
                            System.out.printf("Result: %.2f%n", num1 - num2);
                            break;
                        case 3:
                            System.out.printf("Result: %.2f%n", num1 * num2);
                            break;
                        case 4:
                            if (num2 != 0) {
                                System.out.printf("Result: %.2f%n", num1 / num2);
                            } else {
                                System.out.println("Cannot divide by zero.");
                            }
                            break;
                        default:
                            System.out.println("Invalid operation.");
                    }
                    break;

                case 2:
                    // Calculate Area and Perimeter of a Rectangle
                    System.out.print("Enter length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width of the rectangle: ");
                    double width = scanner.nextDouble();
                    double area = length * width;
                    double perimeter = 2 * (length + width);
                    System.out.printf("Area: %.2f%nPerimeter: %.2f%n", area, perimeter);
                    break;

                case 3:
                    // Solve a Quadratic Equation
                    System.out.print("Enter coefficient a: ");
                    double a = scanner.nextDouble();
                    System.out.print("Enter coefficient b: ");
                    double b = scanner.nextDouble();
                    System.out.print("Enter coefficient c: ");
                    double c = scanner.nextDouble();
                    double discriminant = b * b - 4 * a * c;

                    if (discriminant > 0) {
                        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                        System.out.printf("Roots are real and different: %.2f, %.2f%n", root1, root2);
                    } else if (discriminant == 0) {
                        double root = -b / (2 * a);
                        System.out.printf("Roots are real and same: %.2f%n", root);
                    } else {
                        System.out.println("Roots are complex and different.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println(); // Blank line for better readability
        } while (choice != 4);

        scanner.close();
    }
}
