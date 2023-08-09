import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // variable declaration

        String nome;
        double fixedSalary, totalSales, totalSalary;

        // input

        nome = scanner.nextLine();
        fixedSalary = scanner.nextDouble();
        totalSales = scanner.nextDouble();

        // processing

        totalSalary = (fixedSalary + (totalSales * 0.15));

        // output

        System.out.printf("TOTAL = R$ %.2f\n", totalSalary);
    }
}
