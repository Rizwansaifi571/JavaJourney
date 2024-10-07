import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        // Input the elements of the array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Initialize max and min with the first element
        int max = array[0];
        int min = array[0];
        
        // Find the maximum and minimum elements
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i]; // Update max
            }
            if (array[i] < min) {
                min = array[i]; // Update min
            }
        }
        
        // Output the results
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
        
        scanner.close();
    }
}
