package Week_2;

public class constructorsWeek2
{
    //Constructors without parameters(Default constructor)
    public constructorsWeek2()
    {
        System.out.println("No-argument constructor");
    }

    // Constructor with parameters(Parameterized constructor)
    public constructorsWeek2(String name, int age)
    {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args)
    {
        // Creating objects tp call the methods
        constructorsWeek2 person1 = new constructorsWeek2();
        constructorsWeek2 person2 = new constructorsWeek2("Bharath Sivaraman", 25);
    }
}
