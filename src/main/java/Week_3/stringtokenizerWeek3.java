package Week_3;

import java.util.StringTokenizer;//Importing the tokenizer function from library

public class stringtokenizerWeek3
{
    public static void main(String[] args)
    {
        String input = "Hello World. This is a example of String tokenizer";
        //Creating a tokenizer object
        StringTokenizer tokenizer = new StringTokenizer(input, " .");

        //Printing all the tokens in the string
        while(tokenizer.hasMoreTokens())
        {
            //Get the next token from the string and print it out.
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
