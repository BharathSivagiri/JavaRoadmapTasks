package Week_5.DefaultMethodsWeek5;

interface TestInterface2

{
    // abstract method
    public void square (int a);

    // static method
    static void show()
    {
        System.out.println("Static Method Executed");
    }
}

class StaticMethods implements TestInterface2
{
    // Implementation of square abstract method
    public void square (int a)
    {
        System.out.println(a*a);
    }

    public static void main(String args[])
    {
        StaticMethods d = new StaticMethods();
        d.square(4);

        // Static method executed
        TestInterface2.show();
    }
}

