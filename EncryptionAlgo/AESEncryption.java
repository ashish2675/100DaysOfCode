import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

class AESEncryption {
    public static byte[] encrypt(String plaintext, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        return cipher.doFinal(plaintext.getBytes());
    }

    public static String decrypt(byte[] ciphertext, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptedBytes = cipher.doFinal(ciphertext);
        return new String(decryptedBytes);
    }

    public static void main(String[] args) throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey key = keyGenerator.generateKey();

        String plaintext = "This is a secret message.";
        System.out.println("Plain text: " + plaintext);
        
        byte[] ciphertext = encrypt(plaintext, key);
        System.out.println("Encrypted: " + new String(ciphertext));

        String decrypted = decrypt(ciphertext, key);
        System.out.println("Decrypted: " + decrypted);
    }
}
