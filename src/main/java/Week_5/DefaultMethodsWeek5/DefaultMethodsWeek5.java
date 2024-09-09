package Week_5.DefaultMethodsWeek5;


class DefaultMethodsWeek5 implements TestInterface
{
    @Override
    // implementation of square abstract method
    public void square(int a)
    {
        System.out.println(a*a);
    }

    public static void main(String[] args)
    {
        DefaultMethodsWeek5 d = new DefaultMethodsWeek5();
        d.square(4);

        // default method executed
        d.show();
    }
}

