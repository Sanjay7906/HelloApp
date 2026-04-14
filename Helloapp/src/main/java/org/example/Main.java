package org.example;

public class Main {
    public static void main(String[] args) {
        // Step 1: Check for arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Step 2: Use String.join to concatenate the array with a delimiter
            // This handles multiple names and the "no trailing comma" logic automatically.
            String joinedNames = String.join(", ", args);

            // Step 3: Print the final greeting
            System.out.println("Hello, " + joinedNames + "!");
        }
    }
}