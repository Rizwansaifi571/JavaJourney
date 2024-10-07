import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int year = 0;
        boolean isLeapYear = false;

        // Prompt user for input until a valid year is entered
        while (year <= 0) {
            System.out.print("Enter a positive year: ");
            year = scanner.nextInt();
            if (year <= 0) {
                System.out.println("Please enter a valid positive year.");
            }
        }

        // Check if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        }

        // Output the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}
