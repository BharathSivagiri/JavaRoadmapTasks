package Week_5;

interface MyInterface
{
    /*
     * This is a default method so we need not implement this method in the implementation classes
     */
    default void newMethod()
    {
        System.out.println("Newly added default method in Interface");
    }

    /*
     * This is a static method. Static method in interface is similar to default method except that we cannot override them in the implementation classes.
     * Similar to default methods, we need to implement these methods in implementation classes so we can safely add them to the existing interfaces.
     */
    static void anotherNewMethod()
    {
        System.out.println("Newly added static method in Interface");
    }

    /*
     * Already existing public and abstract method We must need to implement this method in implementation classes.
     */
    void existingMethod(String str);
}

public class InterfaceMethodsWeek5 implements MyInterface
{
    // implementing abstract method
    public void existingMethod(String str)
    {
        System.out.println("String is: " + str);
    }

    // overriding default method
    @Override
    public void newMethod()
    {
        System.out.println("Newly added default method in Class");
    }

    static void anotherNewMethod()
    {
        System.out.println("Newly added static method in Class");
    }

    public static void main(String[] args)
    {
        InterfaceMethodsWeek5 obj = new InterfaceMethodsWeek5();

        // calling the default method of class
        obj.newMethod();

        // calling the static method of class
        InterfaceMethodsWeek5.anotherNewMethod();

        // calling the static method of interface
        MyInterface.anotherNewMethod();

        // calling the abstract method of interface
        obj.existingMethod("Java 8 is easy to learn");

    }
}
