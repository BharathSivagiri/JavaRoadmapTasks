package Week_1;

public class IfElseWeek1
{
    public static void main(String[] args)
    {
        //Nested if-else
        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is equal to b");
        }

        //Simple if-else
        int c = 5;
        if (c % 2 == 0) {
            System.out.println("c is an even number");
        } else {
            System.out.println("c is an odd number");
        }
    }
}
