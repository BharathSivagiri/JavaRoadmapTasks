package Week_5.ForEachMethodWeek5;

import java.util.stream.IntStream;

public class CreativeExamples
{
    public static void main(String[] args)
    {
        int rows = 5;

        IntStream.rangeClosed(1, rows)
                .forEach(i -> System.out.println("*".repeat(i)));
        System.out.println(" ");
        IntStream.rangeClosed(1, rows)
                .forEach(i -> System.out.println("*".repeat(rows - i + 1)));
    }
}
