package Week_1;

public class forLoopWeek1
{
    public static void main(String[] args)
    {
        //Simple for loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }

        //for-each loop or enhanced for loop
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
