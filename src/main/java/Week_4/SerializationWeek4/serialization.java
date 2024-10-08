package Week_4.SerializationWeek4;

import java.io.*;
import java.io.Serializable;

public class serialization implements Serializable
{
    private static final long serialVersionUID = 10L;//Initializing the user defined Version ID

    //Initializing variables
    public transient String SName;//Here transient keyword prevents this particular string from being serialized
    public String SCity;
    public int SRollNo;

    public static void main(String[] args)
    {
        // Creating object of serialization class
        serialization s = new serialization();

        // Setting values for variables
        s.SName = "Deadpool";
        s.SCity = "California";
        s.SRollNo = 123;

        try
        {
            // Serializing the object
            FileOutputStream fileOut = new FileOutputStream("D:\\Aaludra Technology Solutions\\Training\\Tasks\\JavaRoadmapTasks\\src\\main\\java\\Week_4\\SerializationWeek4\\object.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(s);
            out.close();
            System.out.println("Serialized data is saved in object.txt file");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
