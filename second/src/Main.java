// This is a simple Java program that prints "Hello, Java!" to the console

// Every Java program must have at least one class.
// Here, we define a public class named 'Main'.

import java.util.Scanner; // <-- this is required!

public class Main {
    public static void main(String[] args) {

        System.out.println("1 -------------");
        String name = "hello world";
        System.out.println(name); // Prints "Hello, Java!" to the console

        System.out.println("2 -------------");
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.print("what is your name: ");
        String person = scanner.nextLine(); // waits for user to type and press Enter
        System.out.println("hello, " + person);
        scanner.close();

        System.out.println("3 -------------");

        int number = 2;

        if(number <= 4){
            System.out.println("round down");
        } else if(number >= 5){
            System.out.println("round up");
        }

    } // End of main method

} // End of Main class
