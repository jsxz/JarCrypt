<p align="center">
  <img width="170" height="170" src="https://raw.githubusercontent.com/kkrypt0nn/JarCrypt/master/logo.png">
</p>

# JarCrypt
[![Build Status](https://travis-ci.org/kkrypt0nn/JarCrypt.svg?branch=master)](https://travis-ci.org/kkrypt0nn/JarCrypt)
[![java Versions](https://img.shields.io/badge/java-1.8-orange)](https://java.com)
[![Library Version](https://img.shields.io/badge/release-v1.0.0-blue)](https://github.com/kkrypt0nn/JarCrypt/releases)

JarCrypt is a java library made by Krypton so that it is easier for everyone to encrypt, decrypt and decode messages.

## Getting Started
By following the incoming instructions, you will be able to get JarCrypt into any of your projects.

### Prerequisites
To be able to use JarCrypt you will need:
* Java 8
* Java IDE ([IntelliJ IDEA](https://jetbrains.com/idea/) or [Eclipse IDE](https://www.eclipse.org/downloads/packages/release/kepler/sr1/eclipse-ide-java-developers) )

### Installing
* Download the latest `JarCrypt.jar` file in the [release](https://github.com/kkrypt0nn/JarCrypt/releases) section
* Move the file in your project folder
* Add the library into your project
    - IntelliJ IDEA:
        - From the main menu select File -> Project Structure (Ctrl+Shift+Alt+S)
        - Select Modules
        - Open the dependencies tab and click "+"
        - Select the `JarCrypt.jar` file where you stored it
        - Click Add, Apply and then Ok
    - Eclipse IDE:
        - Right click your project
        - Select Build Path
        - Click on Configure Build Path
        - Click on Libraries and select Add External Jar
        - Select the `JarCrypt.jar` file where you stored it
        - Click Apply and Ok

## Usage
To use JarCrypt into your project you first need to import the required files as shown down below.

```java
import spacelab.krypton.jarcrypt.JarCrypt;

public class Example {

    public static void main(String[] args){
        
    }

}
```

To get the library information you need to create a new object.

```java
import spacelab.krypton.jarcrypt.JarCrypt;
import spacelab.krypton.jarcrypt.ciphers.Caesar;

public class Example {

    /* To be able to get library information */
    private static final JarCrypt jarCrypt = new JarCrypt();

    public static void main(String[] args){

         /* Prints information about the library */
         System.out.println(jarCrypt.getLibraryName() + ", Version " + jarCrypt.getLibraryVersion() + ", " + jarCrypt.getLibraryCopyright());
         System.out.println("Made by " + jarCrypt.getLibraryAuthor());
    
    }

}
```

To be able to encrypt or decrypt a message with, for example, the Caesar cipher, you will need to create another object and import the required classes.

```java
import spacelab.krypton.jarcrypt.JarCrypt;
import spacelab.krypton.jarcrypt.ciphers.Caesar;

public class Example {
    /* To be able to get library information */
    private static final JarCrypt jarCrypt = new JarCrypt();

    /* To be able to use the caesar cipher into your project */
    private static final Caesar caesar = new Caesar();

    public static void main(String[] args){

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
```

If you still do not understand after following these steps, there is an example file called [Example.java](Example.java).

## Built With
* [IntelliJ IDEA](https://jetbrains.com/idea)
* [Java 8](https://java.com/en/download/)

## Contributing
Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to this project.

## Bugs & TODOs
The list of known bugs of JarCrypt is available [here](BUGS.md).

The TODO list of JarCrypt is available [here](TODOS.md).

## Issues
Before submitting any issues, make sure to read the [known bugs](BUGS.md) file.

Submit your issues that you encounter while installing and using JarCrypt [here](https://github.com/kkrypt0nn/JarCrypt/issues).

## Versioning
We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/kkrypt0nn/JarCrypt/tags).

## Authors
- **Krypton** - *Initial work* - [kkrypt0nn](https://github.com/kkrypt0nn)

## License
This project is licensed under the [Apache 2.0](LICENSE.md) License - see the [LICENSE.md](LICENSE.md) file for details.
