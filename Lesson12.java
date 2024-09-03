public class Lesson12 {
    // First Function
    static void myMethod1() {
        System.out.println("I am the Best!");
    }    

    // Function with parameter
    static void myMethod2 (String fname, int age) {
        System.out.println(fname + " is " + age);
    }


    // Function with conditional statement
    static void myMethod3 (int age) {
        if (age < 18) {
            System.out.println("You are not Eligible for Vote.");
        }
        else {
            System.out.println("You are Eligible for Vote.");
        }
    }


    // Function with returns
    static int myMethod4 (int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        myMethod1();
        myMethod2("Rizwan", 20);
        myMethod2("Jai", 21);
        myMethod3(21);
        System.out.println(myMethod4(5, 3));
    }

    

}
