package Week_5.Base64_Encode_Decode;

import java.util.Base64;

public class DecodeBase64
{
    public static void main(String[] args)
    {
        String encodedString = "SGVsbG8sIFdvcmxkIQ==";
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);

        System.out.println("Decoded String: " + decodedString);
    }
}
