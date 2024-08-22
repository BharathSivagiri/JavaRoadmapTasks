package Week_2.inheritanceWeek2;

//Parent class
class Bird
{
    void fly()
    {
        System.out.println("I am a Bird");
    }
}
// Inheriting class Bird //Child class 1
class Parrot extends Bird
{
    void whatColourAmI()
    {
        System.out.println("I am green!");
    }
}
// Inheriting class Parrot //Child class 2
class SingingParrot extends Parrot
{
    void whatCanISing()
    {
        System.out.println("I can sing Opera!");
    }
}
public class multilevelInheritance
{
    public static void main(String[] args)
    {
        SingingParrot obj = new SingingParrot();
        obj.whatCanISing();
        obj.whatColourAmI();
        obj.fly();
    }
}

