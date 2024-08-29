package Week_5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferenceWeek5
{
    public static void main(String[] args)
    {
        // Method Reference Concepts:
        // 1. Static method reference
        System.out.println("Static method reference");
        printList(Arrays.asList("product1", "product2", "product3"), MethodReferenceWeek5::print);

        // 2. Instance method reference (non-static method)
        System.out.println("Instance method reference");
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
        fruits.forEach(System.out::println);

        // 3. Constructor reference
        //converting integers to strings
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<String> numberStrings = numbers.stream()
                .map(String::valueOf)
                .collect(java.util.stream.Collectors.toList());
        System.out.println("Number strings: " + numberStrings);
    }

    // Static method to be referenced
    public static void print(String fruit)
    {
        System.out.println(fruit);
    }

    // Method to print list of strings using a consumer
    public static void printList(List<String> list, Consumer<String> consumer)
    {
        list.forEach(consumer);
    }
}
