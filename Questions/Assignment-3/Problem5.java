import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare and initialize the array
        int[] array = new int[size];

        // User input for array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Display the original array
        System.out.println("\nOriginal Array:");
        for(int num : array) {
            System.out.print(num + " ");
        }

        // Reverse the array
        for(int i = 0; i <= size / 2; i++) {
            int temp = array[i];
            array[i] = array[size-1-i];
            array[size-1-i] = temp;
        }

        // Display the reversed array
        System.out.println("\n\nReversed Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
