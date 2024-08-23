package Week_3;

// Abstract class
public abstract class abstractionAbstractClassWeek3
{
    // Abstract method (does not have a body)
    public abstract void abstractMethod();

    // Non-abstract method (has a body)
    public void nonAbstractMethod()
    {
        System.out.println("This is a non-abstract method.");
    }
}

// Subclass that extends the abstract class
class Subclass extends abstractionAbstractClassWeek3
{
    // Implementation of the abstract method
    @Override
    public void abstractMethod()
    {
        System.out.println("This is the implementation of the abstract method.");
    }

    public static void main(String[] args)
    {
        Subclass obj = new Subclass();
        obj.abstractMethod(); // Calls the implemented abstract method
        obj.nonAbstractMethod(); // Calls the non-abstract method
    }
}
