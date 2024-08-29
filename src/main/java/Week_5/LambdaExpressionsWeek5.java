package Week_5;

import java.util.function.*;
//import java.util.function.Consumer;
//import java.util.function.Function;
//import java.util.function.Predicate;
//import java.util.function.Supplier;

public class LambdaExpressionsWeek5
{
    public static void main(String[] args)
    {
        // Runnable
        Runnable task = () -> System.out.println("Hello from lambda!");
        task.run();

        // Supplier
        Supplier<String> greeting = () -> "Hello, world!";
        String message = greeting.get();
        System.out.println(message);

        // Consumer
        Consumer<String> printer = System.out::println;
        printer.accept("This is a message");

        // Predicate
        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        boolean result = isEven.test(4);
        System.out.println(result);

        // Function
        Function<Integer, String> formatter = (n) -> String.format("Number: %d", n);
        String formatted = formatter.apply(10);
        System.out.println(formatted);
    }
}