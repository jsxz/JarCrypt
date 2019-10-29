import spacelab.krypton.jarcrypt.JarCrypt;
import spacelab.krypton.jarcrypt.ciphers.Caesar;

/**
 * Created by Krypton the 10/23/2019 at 7:42 AM
 */
public class Example {

    /* To be able to get library information */
    private static final JarCrypt jarCrypt = new JarCrypt();

    /* To be able to use the caesar cipher into your project */
    private static final Caesar caesar = new Caesar();

    public static void main(String[] args) {

        /* Prints information about the library */
        System.out.println(jarCrypt.getLibraryName() + ", Version " + jarCrypt.getLibraryVersion() + ", " + jarCrypt.getLibraryCopyright());
        System.out.println("Made by " + jarCrypt.getLibraryAuthor() + "\n\n");

        /* Encrypts 'Hello World!' with the key 12 */
        System.out.println("Encrypted Message:");
        System.out.println(caesar.encrypt("Hello world!", 12));

        /* Decrypts 'Tqxxa iadxp!' with the key 12 */
        System.out.println("Decrypted Message:");
        System.out.println(caesar.decrypt("Tqxxa iadxp!", 12));

    }

}
