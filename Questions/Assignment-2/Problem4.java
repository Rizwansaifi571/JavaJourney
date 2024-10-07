import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Remove white spaces
        String modifiedString = removeWhiteSpaces(inputString);

        // Output the modified string
        System.out.println("Modified string (without whitespaces): " + modifiedString);

        scanner.close();
    }

    // Method to remove all white spaces from a string
    private static String removeWhiteSpaces(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char currentchar = str.charAt(i);
            if(currentchar != ' ' && currentchar != '\n' && currentchar != '\t' ) {
                result = result + currentchar;
            }
        } 
        return result;
        
    }
}    
    
