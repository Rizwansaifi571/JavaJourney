public class Lesson02 {
    public static void main(String[] args) {
        // Declare Variables.
        int myNum = 15;
        String name = "Rizwan";
        System.out.println(myNum);
        System.out.println(name);


        // Create variable without value.
        String blank;
        blank = "This is the value.";
        System.out.println(blank);

        
        // Over-write Variable.
        System.out.println("Old value : " + myNum);
        myNum = 255;
        System.out.println("New value : " + myNum);

    
        // Final variable.
        final String final_name = "RIZ";
        //final_name = "Rizwan";
        System.out.println(final_name);


        // Other types.
        float myfloat = 2.46435486f;
        System.out.println(myfloat);
        char myletter = 'D';
        System.out.println(myletter);
        boolean mybool = true;
        System.out.println(mybool);

    }
}
