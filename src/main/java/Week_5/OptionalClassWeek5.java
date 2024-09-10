package Week_5;

import java.util.Optional;

public class OptionalClassWeek5
{
    public static void main(String[] args)
    {
        // 1. Create Optional instances
        Optional<String> optionalName = Optional.of("John Doe");
        Optional<String> optionalNullableName = Optional.ofNullable(null);
        Optional<String> emptyOptional = Optional.empty();

        // 2. Check presence and get value
        optionalName.ifPresent(s -> System.out.println("Name is present: " + s));

        // 3. Provide default values
        String name = optionalNullableName.orElse("Unknown");
        System.out.println("Name: " + name);

        String name2 = optionalNullableName.orElseGet(() -> "Unknown from supplier");
        System.out.println("Name from supplier: " + name2);

        // 4. Perform actions if present
        optionalName.ifPresent(System.out::println);

        // 5. Filter based on condition
        Optional<String> optionalLongName = optionalName.filter(name3 -> name.length() > 5);
        optionalLongName.ifPresent(s -> System.out.println("Long name: " + s));

        // 6. Map to another value
        Optional<Integer> optionalNameLength = optionalName.map(String::length);
        optionalNameLength.ifPresent(integer -> System.out.println("Name length: " + integer));

        // 7. FlatMap to another Optional
        Optional<String> optionalUpperCaseName = optionalName.flatMap(name4 -> Optional.ofNullable(name.toUpperCase()));
        optionalUpperCaseName.ifPresent(s -> System.out.println("Uppercase name: " + s));

        //8. Print empty values
        System.out.println(emptyOptional);
    }
}