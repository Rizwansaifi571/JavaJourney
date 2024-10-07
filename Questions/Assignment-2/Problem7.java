import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Input the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Concatenate the strings
        String concatenatedString = concatenateStrings(firstString, secondString);

        // Output the concatenated result
        System.out.println("Concatenated string: " + concatenatedString);

        scanner.close();
    }

    // Method to concatenate two strings without using concat()
    private static String concatenateStrings(String str1, String str2) {
        // Use StringBuilder for efficient string manipulation
        String result = "";

        // Append first string
        for (int i = 0; i < str1.length(); i++) {
            result = result + str1.charAt(i);
        }

        // Append second string
        for (int i = 0; i < str2.length(); i++) {
            result = result + str2.charAt(i);
        }

        return result; // Convert StringBuilder to String and return
    }
}
