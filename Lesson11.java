import java.util.Arrays;

public class Lesson11 {
    public static void main (String[] args) {

        // Arrays
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(Arrays.toString(cars));
        
        // Access the element
        System.out.println(cars[0]);

        // Change element
        cars[0] = "Tesla";
        System.out.println(Arrays.toString(cars));

        // Array length
        System.out.println(cars.length);

        // loop through an array
        // using for loop
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // using for each loop
        for (String i : cars) {
            System.out.println(i);
        }
    
    
        
        // Multi-Dimensional Arrays
        int[][] num = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(num));

        // access elements
        System.out.println(num[1][1]);

        // change element
        num[1][2] = 7;
        System.out.println(Arrays.deepToString(num));

        // Loop through multi-dimensional array
        // using for loop
        for(int i = 0; i < num.length; i++) {
            for(int j = 0; j <= num.length; j++) {
                System.out.print(num[i][j] + " ");
            }
        }
        System.out.println();

        // using for each loop
        for (int[] row : num) {
            for (int i : row) {
                System.out.print(i + " ");
            }
        }

    }


    
}
