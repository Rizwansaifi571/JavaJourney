public class Lesson16 {
    // Static Method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }
    // Public Method
    public void myPublicMethod() {
        System.out.println("Public method must be called my creating objects");
    }



    // Second Method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }
    public void speed(int maxspeed) {
        System.out.println("Maximum Spees is : " + maxspeed);
    }

    // Main method
    public static void main(String[] args) {
        myStaticMethod();
        // myPublicMethod(); error: non-static method myPublicMethod() cannot be referenced from a static context

        Lesson16 myObj = new Lesson16();
        myObj.myPublicMethod();
        // myObj.myStaticMethod(); warning occur : The static method myStaticMethod() from the type Lesson16 should be accessed in a static way


        Lesson16 speedObj = new Lesson16();
        speedObj.fullThrottle();
        speedObj.speed(150);
    }



    
}
