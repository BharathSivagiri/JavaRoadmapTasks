package Week_5.MethodReferencesWeek5;

public class Person
{

    private final String name;

    public Person(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
