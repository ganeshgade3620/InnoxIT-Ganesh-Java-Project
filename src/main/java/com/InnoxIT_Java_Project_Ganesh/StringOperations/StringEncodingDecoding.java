package StringOperations;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
public class StringEncodingDecoding {

        public static void main(String[] args) {
            String original = "Hello Ganesh Gade";
            // Encode to Base64
            String base64Encoded = Base64.getEncoder()
                    .encodeToString(original.getBytes(StandardCharsets.UTF_8));
            System.out.println("Base64 Encoded: " + base64Encoded);
            // Decode from Base64
            byte[] decodedBytes = Base64.getDecoder().decode(base64Encoded);
            String decoded = new String(decodedBytes, StandardCharsets.UTF_8);
            System.out.println("Decoded from Base64: " + decoded);
        }
    }
