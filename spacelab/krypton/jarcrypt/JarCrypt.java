package spacelab.krypton.jarcrypt;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by Krypton the 10/29/2019 at 1:05 PM
 *
 * JarCrypt is a easy to use java library to let everyone encrypt, decrypt and decode messages.
 *
 * @name JarCrypt
 * @author Krypton
 * @copyright Copyright ©2019 Krypton
 * @credits
 * @licence Apache 2.0
 * @version 1.0.0
 * @maintainer Krypton
 * @status Development (Alpha Build)
 */
public class JarCrypt {

    private String libraryName = "JarCrypt";
    private String libraryAuthor = "Krypton";
    private String libraryCopyright = "Copyright ©2019-" + Calendar.getInstance().get(Calendar.YEAR) + " Krypton";
    private ArrayList<String> libraryCredits = new ArrayList<String>();
    private String libraryLicence = "Apache 2.0";
    private String libraryVersion = "1.0.0";
    private String libraryMaintainer = "Krypton";
    private String libraryStatus = "Development (Alpha Build)";

    /**
    * Get the library name
    * @return the name stored in libraryName
     */
    public String getLibraryName() {
        return libraryName;
    }

    /**
     * Get the library author
     * @return the author(s) stored in libraryAuthor
     */
    public String getLibraryAuthor() {
        return libraryAuthor;
    }

    /**
    * Get the library copyright
    * @return the copyright stored in libraryCopyright
     */
    public String getLibraryCopyright() {
        return libraryCopyright;
    }

    /**
    * Get the library credits
    * @return the credits stored in libraryCredits
     */
    public ArrayList<String> getLibraryCredits() {
        return libraryCredits;
    }

    /**
    * Get the library license
    * @return the license stored in libraryLicence
     */
    public String getLibraryLicence() {
        return libraryLicence;
    }

    /**
    * Get the library version
    * @return the version stored in libraryVersion
     */
    public String getLibraryVersion() {
        return libraryVersion;
    }

    /**
    * Get the library maintainer
    * @return the maintainer stored in libraryMaintainer
     */
    public String getLibraryMaintainer() {
        return libraryMaintainer;
    }

    /**
    * Get the library development status
    * @return the development status stored in libraryStatus
     */
    public String getLibraryStatus() {
        return libraryStatus;
    }

}
