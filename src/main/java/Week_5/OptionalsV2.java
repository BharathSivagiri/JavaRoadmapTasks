package Week_5;

import java.util.Optional;

public class OptionalsV2
{
    public static void main(String[] args)
    {
//        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        Integer[] nums = new Integer[20];
        Optional<Integer> optionalInteger = Optional.ofNullable(nums[9]);

        optionalInteger.ifPresentOrElse(
            integer -> System.out.println(nums[4].intValue()),
            () -> System.out.println("Value is not present")
        );
    }
}
