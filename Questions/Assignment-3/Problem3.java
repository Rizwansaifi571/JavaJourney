import java.util.Scanner;

public class Problem3 {
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
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Bubble sort algorithm to sort the array in ascending order
        for (int i = 0; i < size-1; i++) {
            for(int j = 0; j < size-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        // Display the sorted array
        System.out.println("\n\nSorted Array (Ascending Order):");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
