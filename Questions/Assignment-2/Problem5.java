import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Check if the string is a palindrome
        if (isPalindrome(inputString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }

    // Method to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        int right = str.length() - 1; // End pointer

        for(int i = 0; i <= right / 2; i++) {
            if (str.charAt(i) != str.charAt(right-i)) {
                return false;
            }
        }

        return true; // It's a palindrome if all characters match
    }
}
