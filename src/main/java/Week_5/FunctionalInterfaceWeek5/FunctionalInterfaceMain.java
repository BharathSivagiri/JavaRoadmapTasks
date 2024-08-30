package Week_5.FunctionalInterfaceWeek5;

// Example of using FunctionalInterfacesWeek5
public class FunctionalInterfaceMain
{
    public static void main(String[] args) {
        // We can create an instance of example using a lambda expression.
        example functionalInterface = () -> System.out.println("Performing action in functional interface.");

        // Calling the abstract method
        functionalInterface.performAction();

        // Calling the default method
        functionalInterface.defaultMethod();

        // Calling the static method
        example.staticMethod();
    }
}
