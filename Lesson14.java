public class Lesson14 {
    int x = 5;

    // We put this code in another file also to import Lesson14 class and inherit there variables.
    public static void main(String[] args) {
        Lesson14 myobj1 = new Lesson14();
        Lesson14 myobj2 = new Lesson14();
        System.out.println(myobj1.x);
        System.out.println(myobj2.x);
    }
}
