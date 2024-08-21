package Week_1;

public class stringsWeek1
{
    public static void main(String[] args)
    {
        //String concatenation
        String firstName = "Bharath";
        String secondName = "Sivaraman";
        String fullName = firstName + " " + secondName;
        System.out.println("Full Name: " + fullName);

        //String comparison
        String str1 = "Hello";
        String str2 = "Hello";
        if(str1.equals(str2))
        {
            System.out.println("Both strings are equal");
        }

        //String length
        String str3 = "Welcome to Java";
        int length = str3.length();
        System.out.println("Length of the string: " + length);

        //String manipulation
        String str4 = "Welcome to Java";
        String modifiedString = str4.replace("Java", "Python");
        System.out.println("Modified string: " + modifiedString);

        //String formatting
        int num1 = 10;
        int num2 = 20;
        System.out.printf("Sum of %d and %d is: %d%n", num1, num2, num1 + num2);

        //Substring
        String str5 = "Hello, World!";
        String substring = str5.substring(6, 11);
        System.out.println("Substring: " + substring);

        //Case conversion
        String upperCase = str5.toUpperCase();
        System.out.println(upperCase);
        String lowerCase = upperCase.toLowerCase();
        System.out.println(lowerCase);

        //Trimming
        String str6 = "   Hello, World!   ";
        String trimmedString = str6.trim();
        System.out.println("Trimmed string: " + trimmedString);
    }
}
