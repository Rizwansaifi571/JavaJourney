import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number for check : ");
        int number = input.nextInt();

        boolean isprime = isprime(number);
        boolean ispalindrome = ispalindrome(number);

        if (isprime && ispalindrome) {
            System.out.println(number + " is both prime and palindrome");
        } else if (isprime) {
            System.out.println(number + " is prime but not palindrome");
        } else if (ispalindrome) {
            System.out.println(number + " number is palindrome but not prime");
        } else {
            System.out.println(number + "number is not prime and nor palindrome");
        }

    
        input.close();
    }


    public static boolean isprime(int num) {
        if (num <=1) return false;
        int i = 2;
        while (i <= Math.sqrt(num)) {
            if (num % i == 0) return false;
            i++;
        }
        return true;
    }


    public static boolean ispalindrome(int num) {
        int original = num;
        int reserved = 0;

        while(num > 0) {
            int digit = num % 10;
            reserved = reserved * 10 + digit;
            num = num / 10;
        }

        return original == reserved;

    }
}