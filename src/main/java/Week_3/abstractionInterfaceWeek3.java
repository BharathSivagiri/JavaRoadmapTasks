package Week_3;

// Define an interface called Vehicle with three methods
interface Vehicle 
{
    void start();
    void stop();
    void drive();
}

// Implement the Vehicle interface in the Car class
class Car implements Vehicle 
{
    @Override
    public void start() 
    {
        System.out.println("Car started.");
    }

    @Override
    public void stop() 
    {
        System.out.println("Car stopped.");
    }

    @Override
    public void drive()
    {
        System.out.println("Car is driving.");
    }
}

// Implement the Vehicle interface in the Bike class
class Bike implements Vehicle 
{
    @Override
    public void start() 
    {
        System.out.println("Bike started.");
    }

    @Override
    public void stop() 
    {
        System.out.println("Bike stopped.");
    }

    @Override
    public void drive() 
    {
        System.out.println("Bike is driving.");
    }
}

public class abstractionInterfaceWeek3
{
    public static void main(String[] args)
    {
        // Create an object of the Car class and call its methods
        Vehicle car = new Car();
        car.start();
        car.drive();
        car.stop();

        // Create an object of the Bike class and call its methods
        Vehicle bike = new Bike();
        bike.start();
        bike.drive();
        bike.stop();
    }
}
