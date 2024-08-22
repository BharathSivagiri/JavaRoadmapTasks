package Week_2.inheritanceWeek2;

interface Drivable
{
    public void drive();
}

interface Haulable
{
    public void haul();
}

class Vehicle
{
    public void start()
    {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle implements Drivable
{
    public void drive()
    {
        System.out.println("Car driving");
    }
}

class Truck extends Vehicle implements Haulable
{
    public void haul()
    {
        System.out.println("Truck hauling");
    }
}

class SUV extends Car implements Haulable
{
    public void haul()
    {
        System.out.println("SUV hauling");
    }
    public void offRoad()
    {
        System.out.println("SUV off-roading");
    }
}

public class hybridInheritance
{
    public static void main(String[] args)
    {
        SUV suv = new SUV();
        suv.start();
        suv.drive();
        suv.haul();
        suv.offRoad();
    }
}