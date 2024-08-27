package Week_4.SerializationWeek4;

import java.io.*;
import java.io.Serializable;

public class deserialization implements Serializable
{
    public static void main(String[] args) {
        serialization s = null;

        try {
            // Deserializing the object
            FileInputStream fileIn = new FileInputStream("D:\\Aaludra Technology Solutions\\Training\\Tasks\\JavaRoadmapTasks\\src\\main\\java\\Week_4\\SerializationWeek4\\object.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            s = (serialization) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Serialization Class not found");
            e.printStackTrace();
            return;
        }

        // Displaying the deserialized object
        if (s != null) {
            System.out.println("Deserialized data:");
            System.out.println("Name: " + s.SName);
            System.out.println("City: " + s.SCity);
            System.out.println("Roll No: " + s.SRollNo);
        }
    }
}