import java.util.HashMap;
import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Find the first non-repeated character
        char result = findFirstNonRepeatedCharacter(inputString);

        // Output the result
        if (result != '\0') {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("All characters are repeated.");
        }

        scanner.close();
    }

    // Method to find the first non-repeated character in a string
    private static char findFirstNonRepeatedCharacter(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count the occurrences of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Traverse the string again to find the first non-repeated character
        for (char c : str.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return c; // Return the first non-repeated character
            }
        }

        return '\0'; // Return null character if all are repeated
    }
}
