import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age = input.nextInt();

        if (age >= 18)
            System.out.println("Can Vote");
        else
            System.out.println("Cannot Vote");

        input.close();
    }
}