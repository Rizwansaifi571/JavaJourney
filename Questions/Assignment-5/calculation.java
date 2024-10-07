class Calculator {
    private double operand1;
    private double operand2;

    // Constructor to initialize the operands
    public Calculator(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    // Overloaded method for addition
    public double add() {
        return operand1 + operand2;
    }

    // Overloaded method for subtraction
    public double subtract() {
        return operand1 - operand2;
    }

    // Overloaded method for multiplication
    public double multiply() {
        return operand1 * operand2;
    }

    // Overloaded method for division
    public double divide() {
        if (operand2 != 0) {
            return operand1 / operand2;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}

public class calculation {
    public static void main(String[] args) {
        // Create a calculator instance
        Calculator calculator = new Calculator(10.0, 5.0);
        
        // Perform operations
        System.out.println("Addition: " + calculator.add());
        System.out.println("Subtraction: " + calculator.subtract());
        System.out.println("Multiplication: " + calculator.multiply());
        
        // Perform division with exception handling
        try {
            System.out.println("Division: " + calculator.divide());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
