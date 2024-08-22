package Week_2;

//parent class Animal
class Animal{
    // creating place method
    void place()
    {
        System.out.println("Animals live on earth.");
    }
}
// Dog class extends Animal class
class Dog extends Animal
{
    // overriding place method(method overriding)
    void place()
    {
        System.out.println("Dog lives in kennel.");
    }
}
// Horse class extends Animal class
class Horse extends Animal
{
    // overriding place method
    void place()
    {
        System.out.println("Horse lives in stable.");
    }
}
// Rabbit class extends Animal class
class Rabbit extends Animal
{
    // overriding place method
    void place()
    {
        System.out.println("Rabbit lives in burrow.");
    }
}
public class runtimePolymorphismWeek2
{
    public static void main(String[] args)
    {
        // creating object of Animal class
        Animal A = new Animal();
        A.place();
        A = new Dog();
        A.place();
        A = new Horse();
        A.place();
        A = new Rabbit();
        A.place();
    }
}

