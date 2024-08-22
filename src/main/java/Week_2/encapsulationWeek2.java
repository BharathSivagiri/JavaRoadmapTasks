package Week_2;

public class encapsulationWeek2
{
    // Private variables (Data hiding)
    private String name;
    private int age;

    // Public getter methods
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    // Public setter methods
    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public static void main(String[] args)
    {
        encapsulationWeek2 obj = new encapsulationWeek2();
        obj.setName("Hello");
        obj.setAge(25);

        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
