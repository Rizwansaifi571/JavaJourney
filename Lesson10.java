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


        // Nested for loop
        System.out.print("\nEnter n : ");
        n = input.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int k = 1; k <= n-i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();

        }




    
        input.close();
    }

}
