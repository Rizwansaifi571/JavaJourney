public class Lesson05 {
    public static void main(String[] args) {
        // String example
        String greeting = "Hello";
        System.out.println(greeting);

        // String Methods
        String str = "I am Rizwan and i am the best";
        
        System.out.println("length of String : " + str.length());

        System.out.println("String in Upper-case : " + str.toUpperCase());

        System.out.println("String in lower-case : " + str.toLowerCase());

        System.out.println("Index of Rizwan : " + str.indexOf("Rizwan"));


        String firstname = "Rizwan";
        String lastname = "Saifi";

        System.out.println(firstname.concat(lastname));
    }
}
