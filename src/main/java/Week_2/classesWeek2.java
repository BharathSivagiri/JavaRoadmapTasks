package Week_2;

public class classesWeek2
{
    //Class definition or fields
    private String name;
    private int age;

    //Constructor
    public classesWeek2(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

    //Method
    public void displayInfo()
        {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }

    public static void main(String[] args)
    {
        classesWeek2 person1 = new classesWeek2("Hello World", 30);
        person1.displayInfo();
    }
}
