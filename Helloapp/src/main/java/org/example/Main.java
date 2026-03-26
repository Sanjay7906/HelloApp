package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        String greeting;

        if (args.length > 0) {
            // Using String.join for clean, comma-separated names
            greeting = String.join(", ", args);
        } else {
            greeting = "World";
        }

        // Output the final formatted greeting
        System.out.println("Hello, " + greeting + "!");
    }
}