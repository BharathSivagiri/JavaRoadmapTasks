package Week_3;

import java.util.ArrayList; // Import ArrayList class from java.util package
import java.util.Iterator; // Import Iterator interface from java.util package

public class iteratorWeek3
{
    public static void main(String[] args)
    {
        // Create an ArrayList of Strings named 'names'
        ArrayList<String> names = new ArrayList<String>();

        // Add elements to the 'names' ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Get an Iterator object for the 'names' ArrayList
        Iterator<String> iterator = names.iterator();

        // Loop through the ArrayList using the Iterator
        while (iterator.hasNext()) // Check if there are more elements in the ArrayList
        {
            // Get the next element in the ArrayList
            String name = iterator.next();

            // Print the current element
            System.out.println(name);
        }
    }
}
