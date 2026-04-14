package org.example; // Ensure this matches your directory structure

public class Main {
    public static void main(String[] args) {
        // Step 1: Check if arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // Step 2: Enhanced For Loop - append every name with a delimiter
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Step 3: Remove the trailing ", " using substring
            // nameBuilder.length() - 2 removes the last two characters
            String finalNames = nameBuilder.substring(0, nameBuilder.length() - 2);

            // Step 4: Print the final greeting
            System.out.println("Hello, " + finalNames + "!");
        }
    }
}