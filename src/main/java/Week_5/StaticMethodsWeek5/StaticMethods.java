package Week_5.StaticMethodsWeek5;


class StaticMethods implements TestInterface2
{
    @Override
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

