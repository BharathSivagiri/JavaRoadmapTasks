package Week_4;

import java.util.Scanner;
import java.lang.IllegalArgumentException;

public class exceptionhandlingWeek4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Use a try-catch-finally block to handle exceptions
        try
        {
            // Prompt the user to enter a number
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Check if the number is negative
            if (number < 0)
            {
                // If the number is negative, throw an IllegalArgumentException
                throw new IllegalArgumentException("Number cannot be negative.");
            }

            // If no exception is thrown, calculate and print the square of the number
            System.out.println("The square of " + number + " is " + (number * number));
        } 
        // Catch the IllegalArgumentException and print an error message
        catch (IllegalArgumentException e)
        {
            System.out.println("Error: " + e.getMessage());
        } 
        // Finally block to ensure the Scanner object is closed
        finally
        {
            scanner.close(); // Close the Scanner object
        }
    }
}