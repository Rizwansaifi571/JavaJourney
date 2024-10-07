import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string representing an integer
        System.out.print("Enter a string representing an integer: ");
        String inputString = scanner.nextLine();

        try {
            // Convert the string to an integer
            int integerValue = convertStringToInt(inputString);
            System.out.println("The integer value is: " + integerValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid integer string.");
        }

        scanner.close();
    }

    // Method to convert a string to an integer without using parseInt or valueOf
    private static int convertStringToInt(String str) {
        int result = 0; // Initialize the result
        boolean isNegative = false; // Flag for negative numbers
        int startIndex = 0; // Start index for conversion

        // Check for negative sign
        if (str.charAt(0) == '-') {
            isNegative = true; // Set the negative flag
            startIndex = 1; // Start conversion from the next character
        } else if (str.charAt(0) == '+') {
            startIndex = 1; // Ignore the positive sign
        }

        // Traverse the string character by character
        for (int i = startIndex; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Validate if the character is a digit
            if (currentChar < '0' || currentChar > '9') {
                throw new NumberFormatException(); // Throw exception for invalid character
            }

            // Convert character to integer and update the result
            result = result * 10 + (currentChar - '0');
        }

        // Apply the negative sign if needed
        if (isNegative) {
            result = -result;
        }

        return result; // Return the final integer value
    }
}

