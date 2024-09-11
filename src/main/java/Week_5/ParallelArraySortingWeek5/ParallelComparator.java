package Week_5.ParallelArraySortingWeek5;

import java.util.Arrays;
import java.util.Comparator;

public class ParallelComparator
{
    public static void main(String[] args)
    {
        Integer[] arrnum = {380, 344, 674, 823, 53, 90, 792, 700, 597, 69, 890, 112, 868, 4, 2, 9, 1, 5, 6};
        Integer[] arr2num = {380, 343, 674, 823, 53, 90, 792, 43, 597, 69, 890, 112, 555, 4, 2, 4, 1, 5, 1};

        Arrays.parallelSort(arrnum, Comparator.naturalOrder());
        System.out.println("Sorted integer array using Comparator parallel sorting: " + Arrays.toString(arrnum));

        Arrays.parallelSort(arr2num, 3, 7, Integer::compareTo);
        System.out.println("Sorted integer array using Comparator parallel sorting with index specified: " + Arrays.toString(arr2num));
    }
}
