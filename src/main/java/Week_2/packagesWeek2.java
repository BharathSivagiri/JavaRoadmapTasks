package Week_2;

// Importing the required classes from other packages that are already defined in JAVA API (JDK)
import java.util.*;//This package has tools related to utility packages like scanning input from user etc.

//Importing the custom defined package created by the user
import Week_2.packagesTaskExample.displayMsg;

public class packagesWeek2
{
    // Accessing class from another package
    public static void main(String[] args)
    {
        //Creating object to call the method created
        displayMsg message = new displayMsg();
        message.display();

        //Default package usage(Scanner from utility package)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("You entered: " + num);
    }

}
