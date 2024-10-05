public class Lesson22 {
    public void animalsound () {
        System.out.println("This animal makes a sound");
    }
}

class cat extends Lesson22 {
    public void animalsound() {
        System.out.println("The cat say : meow meow");
    }
}

class dog extends Lesson22 {
    public void animalsound() {
        System.out.println("The dog say : bow wow");
    }
}