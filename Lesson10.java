import java.util.Scanner;

public class Lesson10 {
    public static void main (String[] args) {
    
        // Even number using for loop
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value for checking prime number : ");

        int n = input.nextInt();
        boolean result = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                result = false;
                break;
            }
            else {
                result = true;
            }
        }
        if (result == true) {
            System.out.println(n + " is an prime number.");
        }
        else {
            System.out.println(n + " is not an prime number.");
        }




    
        input.close();
    }

}
