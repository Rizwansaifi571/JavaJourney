import java.util.Scanner;

public class Problem4 {
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

        // User input for the element to search
        System.out.print("\nEnter the element to search for: ");
        int searchElement = scanner.nextInt();

        // Search for the element in the array
        boolean found = false;
        System.out.print("The element " + searchElement + " is found at index(es): ");
        for (int i = 0; i < size; i++) {
            if (array[i] == searchElement) {
                found = true;
                System.out.print(i + " ");
            }
        }

        // If the element is not found
        if (!found) {
            System.out.println("The element " + searchElement + " is not found in the array.");
        }

        scanner.close();
    }
}
