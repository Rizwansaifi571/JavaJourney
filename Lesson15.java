public class Lesson15 {
    // Class Attributes
    int x = 5;
    
    // Multiple objects
    String fname = "Rizwan";
    String lname = "Saifi";
    
    
    public static void main(String[] args) {
        Lesson15 myObj = new Lesson15();
        System.out.println(myObj.x);
        myObj.x = 40;
        System.out.println(myObj.x);


        Lesson15 name1 = new Lesson15();
        Lesson15 name2 = new Lesson15();
        Lesson15 name3 = new Lesson15();
        System.out.println("My First name is " + name1.fname + " and the last name is " + name1.lname);
        name2.fname = "Kashvi";
        name2.lname = "Soni";
        System.out.println("My First name is " + name2.fname + " and the last name is " + name2.lname);
        name3.fname = "Mohd";
        name3.lname = "Rizwan";
        System.out.println("My First name is " + name3.fname + " and the last name is " + name3.lname);




    }
}
