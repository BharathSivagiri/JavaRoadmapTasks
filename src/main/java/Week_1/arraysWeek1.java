package Week_1;

public class arraysWeek1
{
    public static void main(String[] args)
    {
        //Array integer initilization
        int[] numbers = {1, 2, 3, 4, 5};

        //Array string initialization
        String[] over;
        over = new String[3];
        over[0] = "First";
        over[1] = "Second";
        over[2] = "Third";

        //Accessing elements
        System.out.println(numbers[0]);
        System.out.println(numbers[4]);
        System.out.println(over[0]);
        System.out.println(over[2]);

        //Length of array
        System.out.println(numbers.length);
        System.out.println(over.length);

        //Iteration on arrays
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }

        for (String str : over)
        {
            System.out.println(str);
        }

        //Multidimensional arrays
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
