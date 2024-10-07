import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the String : ");
        String str = input.nextLine();

        char[] arr = str.toCharArray();

        String reverse = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            reverse = reverse + arr[i];
        }

        System.out.println("Reverse String : " + reverse);

        input.close();
    }
}
