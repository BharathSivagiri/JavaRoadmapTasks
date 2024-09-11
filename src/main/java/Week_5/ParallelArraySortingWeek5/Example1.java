package Week_5.ParallelArraySortingWeek5;

import java.util.Arrays;

public class Example1
{
    public static void main(String[] args)
    {
        int[] arr = {380, 344, 674, 823, 53, 90, 792, 700, 597, 69, 890, 112, 868, 4, 2, 9, 1, 5, 6};
        String[] names = {"MehmetDas", "ThomasGuzman", "RebeccaHou", "UsmanXiao", "CeciliaVieira", "AliciaContreras", "PavelChauhan", "HuanMaung", "PabloHerrera", "Alice"};
        double[] prices = {862.15, 874.56, 148.57, 277.21, 602.42, 10.5, 5.2, 8.7, 3.9, 15.0};
        float[] weights = {1.2f, 0.8f, 2.5f, 0.5f, 1.7f, 0.3f, 1.9f, 2.1f, 0.7f, 1.1f};
        char[] grades = {'E', 'A', 'C', 'B', 'D', 'F', 'B', 'A', 'C', 'D'};
        long[] ids = {1008, 1005, 1734, 1526, 2254, 6625, 2214, 4414} ;
        short[] ages = {95, 73, 54, 50, 53, 10, 81, 58, 62, 98, 38, 22, 46, 31, 52};

        Arrays.parallelSort(arr, 1, 8);
        System.out.println("Sorted integer array with index specified: " + Arrays.toString(arr));

        Arrays.parallelSort(arr);
        System.out.println("Sorted integer array: " + Arrays.toString(arr));

        System.out.println(" ");

        Arrays.parallelSort(names, 3, 6);
        System.out.println("Sorted names with index specified: " + Arrays.toString(names));

        Arrays.parallelSort(names);
        System.out.println("Sorted names: " + Arrays.toString(names));

        System.out.println(" ");

        Arrays.parallelSort(prices, 2, 7);
        System.out.println("Sorted prices with index specified: " + Arrays.toString(prices));

        Arrays.parallelSort(prices);
        System.out.println("Sorted prices: " + Arrays.toString(prices));

        System.out.println(" ");

        Arrays.parallelSort(weights, 1, 6);
        System.out.println("Sorted weights with index specified: " + Arrays.toString(weights));

        Arrays.parallelSort(weights);
        System.out.println("Sorted weights: " + Arrays.toString(weights));

        System.out.println(" ");

        Arrays.parallelSort(grades, 2, 5);
        System.out.println("Sorted grades with index specified: " + Arrays.toString(grades));

        Arrays.parallelSort(grades);
        System.out.println("Sorted grades: " + Arrays.toString(grades));

        System.out.println(" ");

        Arrays.parallelSort(ids, 2, 6);
        System.out.println("Sorted ids with index specified: " + Arrays.toString(ids));

        Arrays.parallelSort(ids);
        System.out.println("Sorted ids: " + Arrays.toString(ids));

        System.out.println(" ");

        Arrays.parallelSort(ages, 3, 10);
        System.out.println("Sorted ages with index specified: " + Arrays.toString(ages));

        Arrays.parallelSort(ages);
        System.out.println("Sorted ages: " + Arrays.toString(ages));

        System.out.println(" ");
    }
}
