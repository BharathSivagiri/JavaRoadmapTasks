package Week_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionclassesWeek3
{

    public static void main(String[] args)
    {
        // Step 1: Create a list of student names using the Collection interface
        List<String> students = new ArrayList<>();

        // Adding names to the list
        students.add("Digvijay");
        students.add("Chiranjivi");
        students.add("Barbie");
        students.add("Aryan");

        System.out.println("Original List: " + students);

        // Step 2: Sort the names using the Collections utility class
        Collections.sort(students);

        System.out.println("Sorted List: " + students);

        // Step 3: Search for a specific student's name
        int index = Collections.binarySearch(students, "Charlie");
        if (index >= 0)
        {
            System.out.println("Charlie is found at index: " + index);
        } else
        {
            System.out.println("Charlie is not in the list.");
        }
    }
}