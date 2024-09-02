public class Lesson12 {
    // First Function
    static void myMethod1() {
        System.out.println("I am the Best!");
    }    

    // Function with parameter
    static void myMethod2(String fname, int age) {
        System.out.println(fname + " is " + age);
    }



    public static void main(String[] args) {
        myMethod1();
        myMethod2("Rizwan", 20);
        myMethod2("Jai", 21);
    }

}
