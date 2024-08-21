package Week_1;

public class whileLoopWeek1
{
    public static void main(String[] args)
    {
        int i = 0;

        // While loop
        while (i < 5) {
            System.out.println("Value of i: " + i);
            i++;
        }

        // Infinite while loop
//        while (true) {
//            System.out.println("This will never end!");
//        }

        //do-while loop
        int k = 0;

        do {
            System.out.println(k);
            k++;
        } while (k < 5);
    }
}
