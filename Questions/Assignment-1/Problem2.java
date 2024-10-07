import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a b and c of (ax^2 + bx + c) : ");
        
        Double a = input.nextDouble();
        Double b = input.nextDouble();
        Double c = input.nextDouble();

        Double discriminent = (b*b)-(4*a*c);


        if (discriminent > 0) {
            Double root1 = (-b + Math.sqrt(discriminent)) / 2*a;
            Double root2 = (-b - Math.sqrt(discriminent)) / 2*a;
            System.out.println("Roots are real and different : ");
            System.out.println("First Root : " + root1);
            System.out.println("Second Root : " + root2);
        } else if (discriminent == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and same");
            System.out.println("Roots are : " + root);
        } else {
            System.out.println("Roots are complex and different");
        }

        input.close();
    }
}
