package Week_3;

import java.util.*;

public class hashmapWeek3
{
    public static void main(String[] args)
    {
        // Creating a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 20);
        hashMap.put("Cherry", 30);

        // Displaying the HashMap
        System.out.println("HashMap: " + hashMap);

        // Checking if the HashMap is empty
        System.out.println("Is HashMap empty? " + hashMap.isEmpty());

        // Getting the size of the HashMap
        System.out.println("Size of HashMap: " + hashMap.size());

        // Getting the value associated with a specific key
        System.out.println("Value associated with 'Apple': " + hashMap.get("Apple"));

        // Removing a key-value pair from the HashMap
        hashMap.remove("Banana");
        System.out.println("HashMap after removing 'Banana': " + hashMap);

        // Clearing the HashMap
        hashMap.clear();
        System.out.println("HashMap after clearing: " + hashMap);

        // HashMap also supports key-value pairs iteration
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 20);
        hashMap.put("Cherry", 30);

        for (Map.Entry<String, Integer> entry : hashMap.entrySet())
        {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // HashMap also supports converting it to a Set of key-value pairs
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        System.out.println("HashMap as Set of key-value pairs: " + entrySet);

        // HashMap also supports converting it to a List of keys or values
        List<String> keys = new ArrayList<>(hashMap.keySet());
        System.out.println("HashMap as List of keys: " + keys);

        List<Integer> values = new ArrayList<>(hashMap.values());
        System.out.println("HashMap as List of values: " + values);
    }
}