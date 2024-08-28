package Week_4.ExternizableWeek4;

import java.io.*;
import java.io.Externalizable;


public class externalization
{
    public static void main(String[] args)
    {
        // Create an instance of Employee class
        Employee e = new Employee();
        e.name = "Bharath Sivaraman";
        e.city = "Erode";
        e.age = 24;

        // Serialize the Employee object
        try
        {
            // Create a FileOutputStream to write the object to a file
            FileOutputStream fileOut = new FileOutputStream("D:\\Aaludra Technology Solutions\\Training\\Tasks\\JavaRoadmapTasks\\src\\main\\java\\Week_4\\ExternizableWeek4\\test.txt");
            // Create an ObjectOutputStream to write the object to the FileOutputStream
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            // Write the object to the file
            out.writeObject(e);
        }
        catch (IOException i)
        {
            // Handle any IOException that may occur during serialization
            System.out.println(i.getMessage());
        }

        // Deserialize the Employee object
        try
        {
            // Create a FileInputStream to read the object from a file
            FileInputStream fileIn = new FileInputStream("D:\\Aaludra Technology Solutions\\Training\\Tasks\\JavaRoadmapTasks\\src\\main\\java\\Week_4\\ExternizableWeek4\\test.txt");
            // Create an ObjectInputStream to read the object from the FileInputStream
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // Read the object from the file and cast it to Employee
            e = (Employee) in.readObject();
            // Print the deserialized object's attributes
            System.out.println(e.name);
            System.out.println(e.city);
            System.out.println(e.age);
        }
        catch (IOException i)
        {
            // Handle any IOException that may occur during deserialization
            System.out.println(i.getMessage());
        }
        catch (ClassNotFoundException e1)
        {
            // Handle any ClassNotFoundException that may occur during deserialization
            System.out.println(e1.getMessage());
        }
    }
}

// Define the Employee class that implements Externalizable interface
class Employee implements Externalizable
{
    // Default constructor
    public Employee(){}

    // Attributes of the Employee class
    String name;
    int age;
    String city;

    // Override the writeExternal method to customize serialization
    @Override
    public void writeExternal(ObjectOutput out) throws IOException
    {
        // Write the attributes to the ObjectOutput stream
        out.writeObject(name);
        out.writeObject(city);
        out.writeInt(age);
    }

    // Override the readExternal method to customize deserialization
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException
    {
        // Read the attributes from the ObjectInput stream
        name = (String) in.readObject();
        city = (String) in.readObject();
        age = in.readInt();
    }
}