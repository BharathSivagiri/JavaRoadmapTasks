package Week_3;

import java.lang.StringBuffer;//Optional to import the library as the library is automatically used.

public class stringbufferWeek3
{
    public static void main(String[] args)
    {
        // Create a new StringBuffer object with an initial capacity of 16 characters
        StringBuffer sb = new StringBuffer("Hello");

        // Append a string to the StringBuffer
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert a string at a specific index
        sb.insert(6, "Java");
        System.out.println("After insert: " + sb);

        // Replace a range of characters with a string
        sb.replace(6, 10, "Java");
        System.out.println("After replace: " + sb);

        // Delete a range of characters
        sb.delete(6, 10);
        System.out.println("After delete: " + sb);

        // Reverse the characters in the StringBuffer
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Set the length of the StringBuffer to a specific value
        sb.setLength(5);
        System.out.println("After setLength: " + sb);

        // Convert the StringBuffer to a String
        String str = sb.toString();
        System.out.println("After toString: " + str);
    }
}
