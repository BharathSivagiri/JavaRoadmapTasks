package Week_5.FunctionalInterfaceWeek5;

// FunctionalInterface is a special kind of interface that has only one abstract method.
// It can have any number of default methods and static methods.
@FunctionalInterface
public interface example
{
    // This is the abstract method that makes this interface functional.
    void performAction();

    // Default methods can have an implementation.
    default void defaultMethod() {
        System.out.println("This is a default method in FunctionalInterfacesWeek5.");
    }

    // Static methods can also be defined in functional interfaces.
    static void staticMethod() {
        System.out.println("This is a static method in FunctionalInterfacesWeek5.");
    }
}
