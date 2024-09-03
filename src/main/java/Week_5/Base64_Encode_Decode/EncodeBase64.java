package Week_5.Base64_Encode_Decode;

import java.util.Base64;

public class EncodeBase64
{
    public static void main(String[] args)
    {
        String input = "Hello, World!";
        byte[] bytes = input.getBytes();
        String encoded = Base64.getEncoder().encodeToString(bytes);

        System.out.println("Encoded: " + encoded);
    }
}
