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


        // Declare more than one variable at a same time.
        int x = 4, y = 5, z = 6;
        System.out.println(x + y + z);


        // Assign same value with multiple variable.
        int p, q, r;
        p = q = r = 50;
        System.out.println(p + q + r);
    }
}
