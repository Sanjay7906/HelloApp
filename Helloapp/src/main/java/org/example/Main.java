import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] salary = new double[10];
        double[] years = new double[10];
        double totalBonus = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print("Salary: ");
            salary[i] = input.nextDouble();

            System.out.print("Years: ");
            years[i] = input.nextDouble();

            if (salary[i] <= 0 || years[i] < 0) {
                System.err.println("Invalid input");
                i--;
                continue;
            }

            double bonus = (years[i] > 5) ? salary[i] * 0.05 : salary[i] * 0.02;
            totalBonus += bonus;
        }

        System.out.println("Total Bonus: " + totalBonus);

        input.close();
    }
}