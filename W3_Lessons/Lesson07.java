public class Lesson07 {
    public static void main (String[] args) {
        
        // only if statment
        if (18>15) {
            System.out.println("18 is greater than 15");
        }

        // with else statement
        int age = 24;
        if (age > 18) {
            System.out.println("You are adult");
        }
        else {
            System.out.println("you are not adult");
        }

        // if - else statement
        age = 56;
        if (age > 12 & age < 18) {
            System.out.println("You are not a child");
        }
        else if (age >= 18 & age < 50) {
            System.out.println("You are adult");
        }
        else {
            System.out.println("You are old");
        }
        


        // short hand if else
        age = 5;
        String result = (age > 18) ? "You are adult" : "You are child" ;
        System.out.println(result);

    }
}
