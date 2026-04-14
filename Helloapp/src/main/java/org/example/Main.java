public class Main {
    public static void main(String[] args) {
        // Step 1: Check if arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Step 2: Use StringBuilder for efficient string construction
            StringBuilder namesList = new StringBuilder();

            // Step 3: Enhanced For Loop (for-each) to iterate through args
            for (String name : args) {
                // Add a comma and space if StringBuilder is not empty (conditional delimiter)
                if (namesList.length() > 0) {
                    namesList.append(", ");
                }
                namesList.append(name);
            }

            // Step 4: Print the final concatenated greeting
            System.out.println("Hello, " + namesList.toString() + "!");
        }
    }
}