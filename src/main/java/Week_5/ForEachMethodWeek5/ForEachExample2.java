package Week_5.ForEachMethodWeek5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ForEachExample2
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(986, 16, 862, 152, 759, 298, 470);

        System.out.println("Initial List:");
        nums.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("Sorting the List in reverse order:");
        nums.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println(" ");
        System.out.println("Sorting the List in ascending order:");
        nums.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }
}
