package Week_3;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedhashmapWeek3
{
    public static void main(String[] args)
    {
        // Create a LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Add key-value pairs
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 20);
        linkedHashMap.put("Cherry", 30);

        // Print the LinkedHashMap
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // Check if the LinkedHashMap is empty
        System.out.println("Is LinkedHashMap empty? " + linkedHashMap.isEmpty());

        // Get the size of the LinkedHashMap
        System.out.println("Size of LinkedHashMap: " + linkedHashMap.size());

        // Get the value associated with a specific key
        System.out.println("Value associated with 'Apple': " + linkedHashMap.get("Apple"));

        // Remove a key-value pair
        linkedHashMap.remove("Banana");

        // Clear the LinkedHashMap
        linkedHashMap.clear();

        // Check if a specific key exists in the LinkedHashMap
        System.out.println("Does 'Cherry' exist in LinkedHashMap? " + linkedHashMap.containsKey("Cherry"));

        // Iterate over the LinkedHashMap
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet())
        {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}