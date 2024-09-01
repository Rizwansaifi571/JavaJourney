import java.util.Scanner;

public class Lesson09 {
    public static void main(String[] args) {
        // Factorial Using While Loop

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of factorial : ");
        int n = input.nextInt();

        int i = n;
        int result = 1;

        while (i >= 1) {

            result = result * i;

            if (i > 1) {
                System.out.print(i + " " + "x" + " ");
                i--;
            } else if (i == 1) {
                System.out.print(i + " " + "=" + " " + result);
                i--;
            }
        }

        // Fibonacci Series With Do While Loop
        System.out.print("\n\nEnter the number of terms for Fibonacci series: ");
        n = input.nextInt();

        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series: ");
        if (n >= 1) {
            System.out.print(a + " ");
        }
        if (n >= 2) {
            System.out.print(b + " ");
        }

        int count = 2;
        do {
            int sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
            count++;
        } while (count < n);

        input.close();
    }
}