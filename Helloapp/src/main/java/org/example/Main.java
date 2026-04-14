import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.err.println("Invalid number");
            System.exit(0);
        }

        int[] freq = new int[10];

        while (number > 0) {
            int digit = number % 10;
            freq[digit]++;
            number /= 10;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " occurs " + freq[i] + " times");
            }
        }

        input.close();
    }
}