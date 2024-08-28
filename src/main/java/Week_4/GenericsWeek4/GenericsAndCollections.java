package Week_4.GenericsWeek4;

import java.util.*;

public class GenericsAndCollections
{
    public static void main(String[] args)
    {
        // Generic ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Generic Array
        String[] fruits = new String[3];
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Orange";

        // Generic HashMap
        HashMap<Integer, String> studentGrades = new HashMap<>();
        studentGrades.put(1, "A");
        studentGrades.put(2, "B");
        studentGrades.put(3, "C");

        // Printing the collections
        System.out.println("Names: " + names);
        System.out.println("Fruits: " + Arrays.toString(fruits));
        System.out.println("Student Grades: " + studentGrades);
    }
}
