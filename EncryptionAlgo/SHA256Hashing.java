import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;

class SHA256Hashing {
    public static String sha256(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(input.getBytes(StandardCharsets.UTF_8));

            StringBuilder hexString = new StringBuilder(2 * hash.length);
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1)
                    hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String plaintext = "This is a secret message.";
        System.out.println("Plain text: " + plaintext);

        String hash = sha256(plaintext);
        System.out.println("SHA-256 Hash: " + hash);
    }
}
