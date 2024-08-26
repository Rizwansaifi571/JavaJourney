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



        // Operators
        // Assignment Operator
        int x = 5;  // =

        // Arithmetic Operators
        int sum = x + 3;  // +
        int difference = x - 2;  // -
        int product = x * 2;  // *
        int quotient = x / 2;  // /
        int remainder = x % 3;  // %

        // Compound Assignment Operators
        x += 3;  // x = x + 3
        x -= 2;  // x = x - 2
        x *= 2;  // x = x * 2
        x /= 2;  // x = x / 2
        x %= 3;  // x = x % 3

        // Bitwise Operators
        int bitwiseAnd = x & 3;  // &
        int bitwiseOr = x | 3;  // |
        int bitwiseXor = x ^ 3;  // ^
        int bitwiseNot = ~x;  // ~
        int leftShift = x << 1;  // <<
        int rightShift = x >> 1;  // >>
        int unsignedRightShift = x >>> 1;  // >>>

        // Compound Bitwise Assignment Operators
        x &= 3;  // x = x & 3
        x |= 3;  // x = x | 3
        x ^= 3;  // x = x ^ 3
        x <<= 1;  // x = x << 1
        x >>= 1;  // x = x >> 1
        x >>>= 1;  // x = x >>> 1

        // Relational Operators
        boolean isEqual = (x == 5);  // ==
        boolean isNotEqual = (x != 5);  // !=
        boolean isGreater = (x > 3);  // >
        boolean isLess = (x < 7);  // <
        boolean isGreaterOrEqual = (x >= 5);  // >=
        boolean isLessOrEqual = (x <= 5);  // <=

        // Logical Operators
        boolean andCondition = (x > 2 && x < 6);  // &&
        boolean orCondition = (x < 2 || x > 4);  // ||
        boolean notCondition = !(x == 5);  // !

        // Unary Operators
        int positive = +x;  // +
        int negative = -x;  // -
        int increment = ++x;  // Pre-increment
        int decrement = --x;  // Pre-decrement

        // Ternary Operator
        String result = (x > 0) ? "Positive" : "Negative";  // ? :

        // instanceof Operator
        boolean isInteger = (result instanceof String);  // instanceof

        // Print some results
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Bitwise AND: " + bitwiseAnd);
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Result: " + result);
        System.out.println("Is String: " + isInteger);
        
    }
}
