package Week1;

public class Operators
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 5;
        int c;

        // Arithmetic operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Assignment operators

        System.out.println("\nAssignment Operators:");
        c = a;
        System.out.println("c = a: " + c);
        c += a;
        System.out.println("c += a: " + c);
        c -= b;
        System.out.println("c -= b: " + c);
        c *= a;
        System.out.println("c *= a: " + c);
        c /= b;
        System.out.println("c /= b: " + c);
        c %= a;
        System.out.println("c %= a: " + c);

        // Relational operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical operators
        boolean
        x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Bitwise operators
        int m = 10, n = 5;
        System.out.println("\nBitwise Operators:");
        System.out.println("m & n: " + (m & n));
        System.out.println("m | n: " + (m | n));
        System.out.println("m ^ n: " + (m ^ n));
        System.out.println("~m: " + (~m));
        System.out.println("m << 2: " + (m << 2));
        System.out.println("m >> 2: " + (m >> 2));
        System.out.println("m >>> 2: " + (m >>> 2));

        // Ternary operator
        int max = (a > b) ? a : b;
        System.out.println("\nTernary Operator:");
        System.out.println("Maximum of a and b: " + max);

        // Increment and decrement operators
        int i = 5;
        System.out.println("\nIncrement and Decrement Operators:");
        System.out.println("i++: " + (i++));
        System.out.println("i: " + i);
        System.out.println("--i: " + (--i));
        System.out.println("i: " + i);
    }
}
