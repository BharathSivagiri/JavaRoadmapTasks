package Week_5.StreamAPIWeek5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Optional;

public class StreamAPIV2
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(5,1,2,7,4);
        List<String> words = Arrays.asList("Hi", "Hello", "World");

        // Sorting list in descending order
        int nums = numbers.stream()
                .filter(n -> n%2==1)
                .sorted()
                .map(n -> n*2)
                .reduce(0, Integer::sum);

        System.out.println(nums);

        // Filtering list and joining elements into a string
        String wds = words.stream()
                .map(String::toUpperCase)
                .flatMap(word -> Arrays.stream(word.split("H")))
                .collect(Collectors.joining(" ","","!"));

        System.out.println(wds);

        Map<String, Integer> students = new HashMap<>();
        students.put("Alice", 17);
        students.put("Bob", 20);
        students.put("Charlie", 15);

        Map<String, Integer> filtered = students.entrySet()
                .stream()
                .filter(entry -> entry.getValue() >= 18)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(filtered);
    }
}
