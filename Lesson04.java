public class Lesson04 {
    public static void main(String[] args) {
        
        // Widening Casting
        int myInt = 9;
        double mydouble = myInt;
        System.out.println(myInt);
        System.out.println(mydouble);

        // Narrowing Casting
        double d1 = 9.78d;
        int int1 = (int) d1;
        System.out.println(d1);
        System.out.println(int1);
        
        // Real life example of type casting.
        int maxscore = 500;
        int user_score = 423;
        float percentage = (float) user_score / maxscore * 100.0f;
        System.out.println("User percentage is : " + percentage);
        
    }
}
