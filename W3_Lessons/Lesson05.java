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



        // Escape Sequence character

        String ex1 = "This is Rizwan\'s Notes.";
        System.out.println(ex1);
        String ex2 = "This is Rizwan\"s Notes.";
        System.out.println(ex2);
        String ex3 = "This is Rizwan\\s Notes.";
        System.out.println(ex3);
        String ex4 = "This is Rizwan\ns Notes.";
        System.out.println(ex4);
        
        String ex5 = "This is Rizwan\rs Notes.";
        System.out.println(ex5);
        String ex6 = "This is Rizwan\bs Notes.";
        System.out.println(ex6);
        String ex7 = "This is Rizwan\fs Notes.";
        System.out.println(ex7);
        String ex8 = "This is Rizwan\ts Notes.";
        System.out.println(ex8);


    }
}
