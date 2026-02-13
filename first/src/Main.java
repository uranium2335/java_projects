// This is a simple Java program that prints "Hello, Java!" to the console

// Every Java program must have at least one class.
// Here, we define a public class named 'Main'.
public class Main {

    // This is the entry point of the program.
    // The Java Virtual Machine (JVM) looks for this exact method to start the program.
    public static void main(String[] args) {

        // System is a built-in Java class that provides access to system-level operations.
        // out is a static member of System that represents standard output (the console).
        // println is a method of 'out' that prints text followed by a new line.
        System.out.println("Hello, Java!"); // Prints "Hello, Java!" to the console

        // How this works under the hood:
        // 1. You write your code in Main.java
        // 2. The 'javac' compiler converts it into bytecode (Main.class)
        // 3. When you run 'java Main', the JVM reads the bytecode
        // 4. The JVM executes System.out.println, sending output to your terminal
    } // End of main method

} // End of Main class
