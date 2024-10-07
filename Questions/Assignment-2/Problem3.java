import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = input.nextLine();
        System.out.print("Enter the Checking Character : ");
        String check = input.nextLine();
        
        if(check.length() != 1) {
            System.out.println("Please exnter exactly one character");
        } else {
            char charToCount = check.charAt(0);
            int count = countOccurrences(str, charToCount);

            System.out.println("The character '" + charToCount + "' occurs '" + count + "' times in the string.");
        
        }
        
        input.close();
    }


    public static int countOccurrences(String str1, char ch) {
        int count = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ch) {
                count++;
            }
        }


        return count;
    }
}
