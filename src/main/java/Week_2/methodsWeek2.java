package Week_2;

public class methodsWeek2
{
    //Method without parameters
    private static void printMessageEmpty()
    {
        System.out.println("Message: Empty");
    }

    //Method with parameters
    private static void printMessage(String message)
    {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) 
    {
        //Method without parameters called inside main method
        printMessageEmpty();

        //Method with parameters called inside main method
        printMessage("Hello World!");
    }
}
