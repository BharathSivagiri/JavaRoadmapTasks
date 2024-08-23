package Week_3;

import java.util.*;

public class collectioninterfaceWeek3
{
    public static void main(String[] args)
    {
        //All the methods in collection interface
        //add(), remove(), contains(), isEmpty(), size(), etc.

        //Creating an ArrayList
        ArrayList<String> names = new ArrayList<>();

        //Adding elements
        names.add("John");
        names.add("Jane");
        names.add("Tom");

        //Printing the list
        System.out.println(names);

        //Removing an element
        names.remove("Jane");

        //Printing the updated list
        System.out.println(names);

        //Checking if the list is empty
        System.out.println(names.isEmpty());

        //Getting the size of the list
        System.out.println(names.size());

        //Checking if an element is present in the list
        System.out.println(names.contains("Tom"));

        //Clearing the list
        names.clear();

        //Printing the updated list
        System.out.println(names);

        //Checking if the list is empty after clearing
        System.out.println(names.isEmpty());

        //Getting the size of the list after clearing
        System.out.println(names.size());

        //Adding elements using the addAll() method
        ArrayList<String> additionalNames = new ArrayList<>();
        additionalNames.add("Alice");
        additionalNames.add("Bob");

        names.addAll(additionalNames);

        //Printing the updated list
        System.out.println(names);

        //Sorting the list in ascending order
        names.sort(String::compareToIgnoreCase);

        //Printing the sorted list
        System.out.println(names);

        //Reversing the list
        names.reversed();

        //Printing the reversed list
        System.out.println(names);

        //Iterating over the list using for-each loop
        for (String name : names)
        {
            System.out.println(name);
        }

        //Iterating over the list using Iterator
        ArrayList<String> namesCopy = new ArrayList<>(names);
        for (Iterator<String> iterator = namesCopy.iterator(); iterator.hasNext(); )
        {
            String name = iterator.next();
            System.out.println(name);

            //Removing an element from the list using Iterator
            if (name.equals("Alice"))
            {
                iterator.remove();
            }
        }

        //Printing the updated list
        System.out.println(names);

        //Iterating over the list using ListIterator (to iterate in both directions)
        ListIterator<String> listIterator = names.listIterator();
        while (listIterator.hasNext())
        {
            String name = listIterator.next();
            System.out.println(name);

            //Removing an element from the list using ListIterator
            if (name.equals("Bob"))
            {
                listIterator.remove();
            }
        }

        //Printing the updated list
        System.out.println(names);

        //Iterating over the list using ListIterator in reverse order
        listIterator = names.listIterator(names.size());
        while (listIterator.hasPrevious())
        {
            String name = listIterator.previous();
            System.out.println(name);
        }

        //Printing the updated list
        System.out.println(names);

        //Iterating over the list using Stream API (Java 8+)
        names.stream().forEach(System.out::println);

        //Printing the updated list
        System.out.println(names);

        //Converting the list to an array
        String[] namesArray = names.toArray(new String[0]);

        //Printing the array
        System.out.println(Arrays.toString(namesArray));

        //Printing the updated list
        System.out.println(names);

        //Converting the list to a set
        HashSet<String> namesSet = new HashSet<>(names);

        //Printing the set
        System.out.println(namesSet);

        //Printing the updated list
        System.out.println(names);

        //Converting the list to a TreeSet (to maintain sorted order)
        TreeSet<String> namesTreeSet = new TreeSet<>(names);

        //Printing the TreeSet
        System.out.println(namesTreeSet);

        //Printing the updated list
        System.out.println(names);
    }
}
