import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the lengths of the triangle sides
        System.out.print("Enter the length of side A: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter the length of side B: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter the length of side C: ");
        double c = scanner.nextDouble();

        if (a == b && b == c) {
            System.out.println("The triangle is Equilateral.");
        } else if (a == b || b == c || a == c) {
            System.out.println("The triangle is Isosceles.");
        } else {
            System.out.println("The triangle is Scalene.");
        }

        scanner.close();
    }


}
