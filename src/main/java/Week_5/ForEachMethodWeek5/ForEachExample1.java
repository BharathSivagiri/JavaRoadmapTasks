package Week_5.ForEachMethodWeek5;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample1
{
    public static void main(String[] args)
    {
        List<String> gamesList = new ArrayList<>();
        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Hocky");

        System.out.println("ForEach() method - Iterating by passing lambda expression and with a direct object reference");
        gamesList.forEach(games -> System.out.println(games));

        System.out.println(" ");
        System.out.println("ForEach() method - Iterating by passing method reference");
        gamesList.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("ForEachOrdered() method - Iterating by passing lambda expression and with a direct object reference");
        gamesList.stream().forEachOrdered(games -> System.out.println(games));

        System.out.println(" ");
        System.out.println("ForEachOrdered() method - Iterating by passing method reference");
        gamesList.stream().forEachOrdered(System.out::println);

        System.out.println(" ");
        System.out.println("Seperating the first character of each element in the list");
        gamesList.stream().map(games -> games.charAt(2)).forEach(System.out::println);

        System.out.println(" ");
        System.out.println("Sorting the list in ascending order");
        gamesList.stream().sorted().forEach(System.out::println);
    }
}
