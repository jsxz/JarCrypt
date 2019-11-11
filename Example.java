import spacelab.krypton.jarcrypt.JarCrypt;
import spacelab.krypton.jarcrypt.ciphers.*;

/**
 * Created by Krypton the 10/23/2019 at 7:42 AM
 */
public class Example {

    /* To be able to get library information */
    private static final JarCrypt jarCrypt = new JarCrypt();

    /* To be able to use the caesar cipher into your project */
    private static final Caesar caesar = new Caesar();

    /* To be able to use the vigenère cipher into your project */
    private static final Vigenere vigenere = new Vigenere();

    public static void main(String[] args) {

        /* Prints information about the library */
        System.out.println(jarCrypt.getLibraryName() + ", Version " + jarCrypt.getLibraryVersion() + ", " + jarCrypt.getLibraryCopyright());
        System.out.println("Made by " + jarCrypt.getLibraryAuthor() + "\n\n");

        /* Encrypts 'Hello World!' with the key 12 in the caesar cipher */
        System.out.println("Encrypted Caesar Message:");
        System.out.println(caesar.encrypt("Hello world!", 12));

        /* Decrypts 'Tqxxa iadxp!' with the key 12 in the caesar cipher*/
        System.out.println("Decrypted Caesar Message:");
        System.out.println(caesar.decrypt("Tqxxa iadxp!", 12) + "\n");


        /* Encrypts 'HELLOWORLD' with the key 'THEKEY' in the caesar cipher*/
        System.out.println("Decrypted Vigenère Message:");
        System.out.println(vigenere.encrypt("HELLOWORLD", "THEKEY"));

        /* Decrypts 'ALPVSUHYPN' with the key 'THEKEY' in the caesar cipher*/
        System.out.println("Decrypted Vigenère Message:");
        System.out.println(vigenere.decrypt("ALPVSUHYPN", "THEKEY"));

    }

}
