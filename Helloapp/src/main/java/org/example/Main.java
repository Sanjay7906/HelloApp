import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.err.println("Invalid Number");
            System.exit(0);
        }

        int temp = number, count = 0;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }

        System.out.println("Sum: " + sum);

        input.close();
    }
}