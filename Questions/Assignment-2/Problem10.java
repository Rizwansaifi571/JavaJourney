import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Generate and display all permutations
        System.out.println("All permutations of the string are:");
        generatePermutations(inputString, "");

        scanner.close();
    }

    // Method to generate all permutations of the string
    private static void generatePermutations(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix); // Base case: print the permutation
        } else {
            for (int i = 0; i < str.length(); i++) {
                // Choose a character at index i
                char chosenChar = str.charAt(i);
                // Form the remaining string after removing the chosen character
                String remaining = str.substring(0, i) + str.substring(i + 1);
                // Recursive call to generate permutations with the chosen character as prefix
                generatePermutations(remaining, prefix + chosenChar);
            }
        }
    }
}
