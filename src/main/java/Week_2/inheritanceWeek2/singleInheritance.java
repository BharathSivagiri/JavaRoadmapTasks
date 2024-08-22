package Week_2.inheritanceWeek2;

// Parent class
class Animal
{
    public void eat()
    {
        System.out.println("The animal can eat.");
    }
}

// Child class
class Dog extends Animal
{
    public void sound()
    {
        System.out.println("The dog barks.");
    }
}

public class singleInheritance
{
    public static void main(String[] args)
    {
        Dog myDog = new Dog();
        myDog.eat(); // Output: The animal can eat.
        myDog.sound(); // Output: The dog barks.
    }
}