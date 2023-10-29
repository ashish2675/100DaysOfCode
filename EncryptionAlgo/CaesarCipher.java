class CaesarCipher {
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                result.append((char) ((character - base + shift) % 26 + base));
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift);
    }

    public static void main(String[] args) {
        String plaintext = "This is a secret message.";
        System.out.println("Plain text: " + plaintext);
        int shift = 3;
        String ciphertext = encrypt(plaintext, shift);
        System.out.println("Encrypted: " + ciphertext);
        String decrypted = decrypt(ciphertext, shift);
        System.out.println("Decrypted: " + decrypted);
    }
}