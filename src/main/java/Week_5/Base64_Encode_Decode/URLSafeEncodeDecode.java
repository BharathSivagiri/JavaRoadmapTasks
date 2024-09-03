package Week_5.Base64_Encode_Decode;

import java.util.Base64;

public class URLSafeEncodeDecode
{
    public static void main(String[] args)
    {
        String originalString = "Hello, World!";
        String encodedString = Base64.getUrlEncoder().encodeToString(originalString.getBytes());
        System.out.println("Encoded string: " + encodedString);

        String decodedString = new String(Base64.getUrlDecoder().decode(encodedString));
        System.out.println("Decoded string: " + decodedString);
    }
}
