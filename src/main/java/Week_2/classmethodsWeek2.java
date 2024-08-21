package Week_2;

import java.util.Scanner;

public class classmethodsWeek2
{
    // Creating class method
    public static int addNumbers(int a, int b)
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int result = classmethodsWeek2.addNumbers(num1, num2);
        System.out.println("The sum is: " + result);

        scanner.close();
    }
}
