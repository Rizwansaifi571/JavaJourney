import java.util.Scanner;

public class Lesson09 {
    public static void main(String[] args) {
        // Factorial Using While Loop

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of factorial : ");
        int n = input.nextInt();

        int i = n;
        int result = 1;
        
        while(i >= 1) {

            result = result * i;

            if (i > 1) {
                System.out.print(i + " " +  "x" + " ");
                i--;
            }
            else if (i == 1) {
                System.out.print(i + " " + "=" + " " + result);
                i--;
            }
        }
        input.close();
    }

}