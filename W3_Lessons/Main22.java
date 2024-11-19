public class Main22 {
    public static void main(String[] args) {
        Lesson22 myanimal = new Lesson22();
        cat mycat = new cat();    // you are allowing mycat to reference an object of the cat class while being treated as an object of its superclass Lesson22
        dog mydog = new dog();
        myanimal.animalsound();
        mycat.animalsound();
        mydog.animalsound();
    }
}
