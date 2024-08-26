package Week_3;

import java.util.*;

public class treemapWeek3
{
    public static void main(String[] args)
    {
        // Creating a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Adding key-value pairs
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 20);
        treeMap.put("Cherry", 30);

        // Displaying the TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Checking if the TreeMap is empty
        System.out.println("Is TreeMap empty? " + treeMap.isEmpty());

        // Getting the size of the TreeMap
        System.out.println("Size of TreeMap: " + treeMap.size());

        // Getting the value associated with a specific key
        System.out.println("Value associated with 'Apple': " + treeMap.get("Apple"));

        // Removing a key-value pair
        treeMap.remove("Banana");

        // Clearing the TreeMap
        treeMap.clear();

        // Iterating over key-value pairs
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 20);
        treeMap.put("Cherry", 30);

        for (Map.Entry<String, Integer> entry : treeMap.entrySet())
        {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Getting the first and last key-value pairs
        Map.Entry<String, Integer> firstEntry = treeMap.firstEntry();
        Map.Entry<String, Integer> lastEntry = treeMap.lastEntry();

        System.out.println("First Key: " + firstEntry.getKey() + ", Value: " + firstEntry.getValue());
        System.out.println("Last Key: " + lastEntry.getKey() + ", Value: " + lastEntry.getValue());

        // Navigating through the TreeMap
        Map.Entry<String, Integer> lowerEntry = treeMap.lowerEntry("Cherry");
        Map.Entry<String, Integer> floorEntry = treeMap.floorEntry("Cherry");

        System.out.println("Lower Key: " + lowerEntry.getKey() + ", Value: " + lowerEntry.getValue());
        System.out.println("Floor Key: " + floorEntry.getKey() + ", Value: " + floorEntry.getValue());
    }
}