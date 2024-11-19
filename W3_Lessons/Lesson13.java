import java.util.Scanner;

public class Lesson13 {
    // Recursion Function (Factorial)
    static int myMethod1(int x) {
        if (x > 0) {
            return x * myMethod1(x - 1);
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value for Finding Factorial : ");
        int x = input.nextInt();
        System.out.println("Factorial of " + x + " is : " + myMethod1(x));
        input.close();
    }
}
