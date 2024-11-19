import java.util.Scanner;

public class Lesson08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // First switch case: Day of the week
        System.out.print("Enter a day number (1-7): ");
        int day = input.nextInt();

        // Switch case to print the corresponding day
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number. Please enter a number between 1 and 7.");
                break;
        }

        // Second switch case: Party day input
        System.out.print("\nEnter a day number for the party (1-7): ");
        day = input.nextInt();

        // Switch case with default parameter
        switch (day) {
            case 6:
                System.out.println("Saturday is a nice choice!");
                break;
            case 7:
                System.out.println("Sunday might be busy.");
                break;
            default:
                System.out.println("Weekdays can be tough for parties. Weekends are better!");
                break;
        }

        
        // Close the scanner
        input.close();
    }
}
