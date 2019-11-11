package spacelab.krypton.jarcrypt.ciphers;

/**
 * Created by Krypton the 11/11/2019 at 08:32
 */
public class Vigenere {

    /**
     * Encrypts a message in the vigenère cipher with the given key
     * @param message String - The message that should be encrypted
     * @param key String - The key that should be used to encrypt
     * @return the message that has been encrypted
     */
    public String encrypt(String message, String key) {

        StringBuilder encryptedMessage = new StringBuilder();
        message = message.toUpperCase();
        key = key.toUpperCase();

        for (int i = 0, j = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c < 'A' || c > 'Z') continue;
            encryptedMessage.append((char) ((c + key.charAt(j) - 2 * 'A') % 26 + 'A'));
            j = ++j % key.length();
        }

        return encryptedMessage.toString();

    }

    /**
     * Decrypts a message in the vigenère cipher with the given key
     * @param message String - The message that should be decrypted
     * @param key String - The key that should be used to decrypt
     * @return the message that has been decrypted
     */
    public String decrypt(String message, String key) {

        StringBuilder decryptedMessage = new StringBuilder();
        message = message.toUpperCase();
        key = key.toUpperCase();

        for (int i = 0, j = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c < 'A' || c > 'Z') continue;
            decryptedMessage.append((char) ((c - key.charAt(j) + 26) % 26 + 'A'));
            j = ++j % key.length();
        }

        return decryptedMessage.toString();

    }

}
