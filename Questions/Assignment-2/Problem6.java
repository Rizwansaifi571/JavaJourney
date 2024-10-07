import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Find the length of the string
        int length = findLength(inputString);

        // Output the length of the string
        System.out.println("The length of the string is: " + length);

        scanner.close();
    }

    // Method to find the length of a string without using length() method
    @SuppressWarnings("unused")
    private static int findLength(String str) {
        int count = 0;

        // Traverse the string character by character
        for(char c : str.toCharArray()) {
            count++;
        }

        return count; // Return the total count
    }
}
