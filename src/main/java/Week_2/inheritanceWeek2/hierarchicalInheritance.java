package Week_2.inheritanceWeek2;

class Electronics
{
    void power()
    {
        System.out.println("Power consumer");
    }
}
class Laptop extends Electronics
{
    void computer()
    {
        System.out.println("Handheld PC");
    }
}
class Smartphone extends Electronics
{
    void mobile()
    {
        System.out.println("Handheld phone");
    }
}
public class hierarchicalInheritance
{
    public static void main(String[] args)
    {
         //Create object
         Smartphone smartphone = new Smartphone();
         Laptop laptop = new Laptop();

         //Call smartphone
         smartphone.power();
         smartphone.mobile();  //This will call the overridden method from Laptop class

        //Call laptop
         laptop.power();
         laptop.computer();//This will call the overridden method from Laptop class
    }
}
