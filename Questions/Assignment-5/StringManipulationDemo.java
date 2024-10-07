class StringManipulator {
    private String inputString;

    // Constructor to initialize the input string
    public StringManipulator(String inputString) {
        this.inputString = inputString;
    }

    // Method to concatenate another string to the input string
    public String concatenate(String anotherString) {
        return inputString + anotherString;
    }

    // Method to extract a substring from the input string
    public String substring(int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex > inputString.length() || startIndex > endIndex) {
            return "Invalid indices";
        }
        return inputString.substring(startIndex, endIndex);
    }

    // Method to reverse the input string
    public String reverse() {
        String reversed = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversed += inputString.charAt(i);
        }
        return reversed;
    }

    // Overloaded method to reverse a substring
    public String reverse(int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex > inputString.length() || startIndex > endIndex) {
            return "Invalid indices";
        }
        String substringToReverse = inputString.substring(startIndex, endIndex);
        return new StringBuilder(substringToReverse).reverse().toString();
    }

    // Method to display the input string
    public void display() {
        System.out.println("Input String: " + inputString);
    }
}

public class StringManipulationDemo {
    public static void main(String[] args) {
        // Create an instance of StringManipulator
        StringManipulator stringManipulator = new StringManipulator("Hello, World!");

        // Display the original string
        stringManipulator.display();

        // Concatenate another string
        String concatenatedString = stringManipulator.concatenate(" Welcome to Java!");
        System.out.println("Concatenated String: " + concatenatedString);

        // Extract a substring
        String substring = stringManipulator.substring(7, 12);
        System.out.println("Substring (7 to 12): " + substring);

        // Reverse the original string
        String reversedString = stringManipulator.reverse();
        System.out.println("Reversed String: " + reversedString);

        // Reverse a substring
        String reversedSubstring = stringManipulator.reverse(0, 5);
        System.out.println("Reversed Substring (0 to 5): " + reversedSubstring);
    }
}
