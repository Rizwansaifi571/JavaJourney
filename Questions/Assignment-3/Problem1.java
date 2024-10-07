import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = input.nextInt();
        System.out.print("Enter Element of an array : ");
        int[] arr = new int[size];
        for(int i = 0; i < size ; i++) {
            arr[i] = input.nextInt();
        }

        int sum = 0;
        System.out.print("Original Array Elements: ");
        for(int i = 0; i < size; i++) { 
            System.out.print(arr[i] + " ");
            sum = sum + arr[i];
        }

        double avg = sum / size;
        
        System.out.println("\nSum of array elements: " + sum);
        System.out.println("Average of array elements: " + avg);


        input.close();
    }

}
