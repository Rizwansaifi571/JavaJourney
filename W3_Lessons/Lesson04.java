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
        System.out.println("x = " + x);

        // Arithmetic Operators
        int sum = x + 3;  // +
        System.out.println("Sum: " + sum);

        int difference = x - 2;  // -
        System.out.println("Difference: " + difference);

        int product = x * 2;  // *
        System.out.println("Product: " + product);

        int quotient = x / 2;  // /
        System.out.println("Quotient: " + quotient);

        int remainder = x % 3;  // %
        System.out.println("Remainder: " + remainder);

        // Compound Assignment Operators
        x += 3;  // x = x + 3
        System.out.println("x after += 3: " + x);

        x -= 2;  // x = x - 2
        System.out.println("x after -= 2: " + x);

        x *= 2;  // x = x * 2
        System.out.println("x after *= 2: " + x);

        x /= 2;  // x = x / 2
        System.out.println("x after /= 2: " + x);

        x %= 3;  // x = x % 3
        System.out.println("x after %= 3: " + x);

        // Bitwise Operators
        int bitwiseAnd = x & 3;  // &
        System.out.println("Bitwise AND: " + bitwiseAnd);

        int bitwiseOr = x | 3;  // |
        System.out.println("Bitwise OR: " + bitwiseOr);

        int bitwiseXor = x ^ 3;  // ^
        System.out.println("Bitwise XOR: " + bitwiseXor);

        int bitwiseNot = ~x;  // ~
        System.out.println("Bitwise NOT: " + bitwiseNot);

        int leftShift = x << 1;  // <<
        System.out.println("Left Shift: " + leftShift);

        int rightShift = x >> 1;  // >>
        System.out.println("Right Shift: " + rightShift);

        int unsignedRightShift = x >>> 1;  // >>>
        System.out.println("Unsigned Right Shift: " + unsignedRightShift);

        // Compound Bitwise Assignment Operators
        x &= 3;  // x = x & 3
        System.out.println("x after &= 3: " + x);

        x |= 3;  // x = x | 3
        System.out.println("x after |= 3: " + x);

        x ^= 3;  // x = x ^ 3
        System.out.println("x after ^= 3: " + x);

        x <<= 1;  // x = x << 1
        System.out.println("x after <<= 1: " + x);

        x >>= 1;  // x = x >> 1
        System.out.println("x after >>= 1: " + x);

        x >>>= 1;  // x = x >>> 1
        System.out.println("x after >>>= 1: " + x);

        // Relational Operators
        boolean isEqual = (x == 5);  // ==
        System.out.println("Is Equal: " + isEqual);

        boolean isNotEqual = (x != 5);  // !=
        System.out.println("Is Not Equal: " + isNotEqual);

        boolean isGreater = (x > 3);  // >
        System.out.println("Is Greater: " + isGreater);

        boolean isLess = (x < 7);  // <
        System.out.println("Is Less: " + isLess);

        boolean isGreaterOrEqual = (x >= 5);  // >=
        System.out.println("Is Greater or Equal: " + isGreaterOrEqual);

        boolean isLessOrEqual = (x <= 5);  // <=
        System.out.println("Is Less or Equal: " + isLessOrEqual);

        // Logical Operators
        boolean andCondition = (x > 2 && x < 6);  // &&
        System.out.println("Logical AND: " + andCondition);

        boolean orCondition = (x < 2 || x > 4);  // ||
        System.out.println("Logical OR: " + orCondition);

        boolean notCondition = !(x == 5);  // !
        System.out.println("Logical NOT: " + notCondition);

        // Unary Operators
        int positive = +x;  // +
        System.out.println("Unary Plus: " + positive);

        int negative = -x;  // -
        System.out.println("Unary Minus: " + negative);

        int increment = ++x;  // Pre-increment
        System.out.println("Pre-increment: " + increment);

        int decrement = --x;  // Pre-decrement
        System.out.println("Pre-decrement: " + decrement);

        // Ternary Operator
        String result = (x > 0) ? "Positive" : "Negative";  // ? :
        System.out.println("Ternary Result: " + result);

        // instanceof Operator
        boolean isString = (result instanceof String);  // instanceof
        System.out.println("Is String: " + isString);
        
    }
}
