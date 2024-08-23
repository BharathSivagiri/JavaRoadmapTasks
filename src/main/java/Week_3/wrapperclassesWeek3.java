package Week_3;

public class wrapperclassesWeek3
{
    public static void main(String[] args)
    {
        // Creating wrapper objects for primitive data types
        Integer myInt = new Integer(10); // Wraps int into Integer object
        Character myChar = new Character('A'); // Wraps char into Character object
        Boolean myBool = new Boolean(true); // Wraps boolean into Boolean object

        // Unboxing: Converting wrapper objects back to primitive data types
        int intValue = myInt.intValue(); // Unwraps Integer object to int
        char charValue = myChar.charValue(); // Unwraps Character object to char
        boolean boolValue = myBool.booleanValue(); // Unwraps Boolean object to boolean

        // Printing the unboxed values
        System.out.println("Integer value: " + intValue);
        System.out.println("Character value: " + charValue);
        System.out.println("Boolean value: " + boolValue);
    }
}
