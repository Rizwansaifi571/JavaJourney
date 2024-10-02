// Java Constructor

public class Lesson17 {
    int x;
    String name1;
    // public Lesson17() {
    //     x = 5;
    // }

    public Lesson17(int age, String  name) {
        x = age;
        name1 = name;
    }
    public static void main(String[] args) {
        Lesson17 obj1 = new Lesson17(20, "Rizwan");
        System.out.println(obj1.x + " " + obj1.name1);
    }
}

