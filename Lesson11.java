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
    }
    
}
