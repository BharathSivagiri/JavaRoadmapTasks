package Week_1;

public class breakAndContinueWeek1
{
    public static void main(String[] args)
    {
        //Break
        for (int i = 0; i < 10; i++) 
        {
        if (i == 5) 
            {
                break;
            }
            System.out.println("Value of i: " + i);
        }

        System.out.println("\n");

        //Continue
        for (int j = 0; j < 10; j++)
        {
        if (j % 2 == 0)
            {
                continue;
            }
            System.out.println("Value of j: " + j);
        }
    }
}
