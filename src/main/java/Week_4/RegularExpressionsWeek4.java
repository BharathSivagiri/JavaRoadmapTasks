package Week_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsWeek4 
{
    public static void main(String[] args) 
    {
        // Define a sample string
        String text = "Hello, this is a sample text with numbers 123 and special characters @#$!";

        // Define a regular expression pattern
        // This pattern matches words starting with 'H' followed by any number of lowercase letters
        Pattern pattern = Pattern.compile("\\bH[a-z]*");

        // Create a Matcher object to find matches in the text
        Matcher matcher = pattern.matcher(text);

        // Print the matches found in the text
        System.out.println("Matches found:");
        while (matcher.find()) 
        {
            System.out.println(matcher.group());
        }

        // Replace all occurrences of the pattern with a new string
        String replacedText = matcher.replaceAll("Replaced");
        System.out.println("\nReplaced text:");
        System.out.println(replacedText);
    }
}
