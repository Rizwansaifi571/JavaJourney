import java.util.Scanner;
import java.util.Random;

public class Problem2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = input.nextInt();
        int[] arr = new int[size];

        System.out.print("Generated Array : ");
        for(int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100) + 1;
            System.out.print(arr[i] + " ");
        }


        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i < size; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
            
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("\nMin value : " + min);
        System.out.println("Max value : " + max);

        input.close();
    }    
}
