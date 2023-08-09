import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // variable declaration

        int number, amountHoursWorked;
        double amountPerHour, salary;

        // input

        number = scanner.nextInt();
        amountHoursWorked = scanner.nextInt();
        amountPerHour = scanner.nextDouble();

        // processing

        salary = amountHoursWorked * amountPerHour;

        // output

        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", number, salary);
    }
}
