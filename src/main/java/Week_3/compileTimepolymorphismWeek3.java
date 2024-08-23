package Week_3;

class CompileTime 
{
    // perimeter method with a single argument
    static int perimeter(int a) 
    {
        return 4 * a;
    }
    // perimeter method with two arguments (method overloading)
    static int perimeter(int l, int b) {
        return 2 * (l + b);
    }
}
public class compileTimepolymorphismWeek3
{
    public static void main(String[] args) {
        // calling perimeter method by passing a single argument
        CompileTime time = new CompileTime();
        System.out.println("Side of square : 4\nPerimeter of square will be : " + time.perimeter(4) + "\n");
        // calling perimeter method by passing two arguments
        System.out.println("Sides of rectangle are : 10, 13\nPerimeter of rectangle will be : " + time.perimeter(10, 13));
    }
}

