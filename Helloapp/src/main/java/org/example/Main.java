import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] ages = new int[10];

        System.out.println("Enter ages:");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt();
        }

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.err.println("Invalid age");
            } else if (ages[i] >= 18) {
                System.out.println(ages[i] + " can vote");
            } else {
                System.out.println(ages[i] + " cannot vote");
            }
        }

        input.close();
    }
}