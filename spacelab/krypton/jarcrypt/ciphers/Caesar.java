package spacelab.krypton.jarcrypt.ciphers;

/**
 * Created by Krypton the 10/29/2019 at 1:05 PM
 */
public class Caesar {

    /**
     * Encrypts a message in the caesar cipher with the given key
     * @param message String - The message that should be encrypted
     * @param key Integer - The key that should be used to encrypt
     * @return the message that has been encrypted
     */
    public String encrypt(String message, Integer key) {
        if (key > 26 || key < 1) {
            return null;
        }
        StringBuilder encryptedText = new StringBuilder(message);
        String alphabetUppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetLowercase = alphabetUppercase.toLowerCase();
        String encryptedAlphabetUppercase = alphabetUppercase.substring(key) + alphabetUppercase.substring(0,key);
        String encryptedAlphabetLowercase = alphabetLowercase.substring(key) + alphabetLowercase.substring(0,key);
        for(int i = 0; i < encryptedText.length(); i++) {
            char currentCharacter = encryptedText.charAt(i);
            if(alphabetUppercase.indexOf(currentCharacter) != -1){
                int index = alphabetUppercase.indexOf(currentCharacter);
                char newCharacter = encryptedAlphabetUppercase.charAt(index);
                encryptedText.setCharAt(i, newCharacter);
            }
            if(alphabetLowercase.indexOf(currentCharacter) != -1){
                int index = alphabetLowercase.indexOf(currentCharacter);
                char newCharacter = encryptedAlphabetLowercase.charAt(index);
                encryptedText.setCharAt(i, newCharacter);
            }
        }
        return encryptedText.toString();
    }

    /**
     * Decrypts a message in the caesar cipher with the given key
     * @param message String - The message that should be decrypted
     * @param key Integer - The key that should be used to decrypt
     * @return the message that has been decrypted
     */
    public String decrypt(String message, Integer key) {
        if (key > 26 || key < 1) {
            return null;
        }
        key = 26-key;
        StringBuilder decryptedText = new StringBuilder(message);
        String alphabetUppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetLowercase = alphabetUppercase.toLowerCase();
        String encryptedAlphabetUppercase = alphabetUppercase.substring(key) + alphabetUppercase.substring(0,key);
        String encryptedAlphabetLowercase = alphabetLowercase.substring(key) + alphabetLowercase.substring(0,key);
        for(int i = 0; i < decryptedText.length(); i++) {
            char currentCharacter = decryptedText.charAt(i);
            if(alphabetUppercase.indexOf(currentCharacter) != -1){
                int index = alphabetUppercase.indexOf(currentCharacter);
                char newCharacter = encryptedAlphabetUppercase.charAt(index);
                decryptedText.setCharAt(i, newCharacter);
            }
            if(alphabetLowercase.indexOf(currentCharacter) != -1){
                int index = alphabetLowercase.indexOf(currentCharacter);
                char newCharacter = encryptedAlphabetLowercase.charAt(index);
                decryptedText.setCharAt(i, newCharacter);
            }
        }
        return decryptedText.toString();
    }

}
