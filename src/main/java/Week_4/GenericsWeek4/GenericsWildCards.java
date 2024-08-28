package Week_4.GenericsWeek4;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildCards
{
    public static void printElements(List<?> list)
    {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void addNumbers(List<? super Integer> list)
    {
        list.add(10);
        list.add(20);
    }

    public static void main(String[] args) {
        // Unbounded wildcard
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        printElements(stringList);

        // Upper-bounded wildcard
        List<Number> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(3.14);
        printElements(numberList);

        // Lower-bounded wildcard
        List<Integer> integerList = new ArrayList<>();
        addNumbers(integerList);
        printElements(integerList);
    }
}
