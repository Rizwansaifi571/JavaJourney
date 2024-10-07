import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the age of the customer
        System.out.print("Enter the age of the customer: ");
        int age = scanner.nextInt();
        
        // Input the show time
        System.out.print("Enter the show time (in 24-hour format, e.g., 14 for 2 PM): ");
        int showTime = scanner.nextInt();

        // Determine the ticket price
        int ticketPrice = 0;

        if (age <= 12) { // Children
            if (showTime < 18) { // Before 6 PM
                ticketPrice = 5;
            } else { // After 6 PM
                ticketPrice = 8;
            }
        } else if (age > 12 && age <= 65) { // Adults
            if (showTime < 18) { // Before 6 PM
                ticketPrice = 10;
            } else { // After 6 PM
                ticketPrice = 12;
            }
        } else if (age > 65) { // Seniors
            ticketPrice = 8; // For all show times
        } else {
            System.out.println("Invalid age entered.");
            scanner.close();
            return; // Exit the program if invalid age
        }

        // Output the ticket price
        System.out.println("The ticket price is: Rs. " + ticketPrice);
        
        scanner.close();
    }
}
