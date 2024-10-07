import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int limit = scanner.nextInt();
        
        int a = 0, b = 1;
        System.out.print("Fibonacci Series up to " + limit + ": " + a + ", " + b);

        while (b <= limit) {
            int next = a + b;
            if (next > limit) break;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
        scanner.close();
    }
}
