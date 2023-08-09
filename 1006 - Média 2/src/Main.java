import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // variable declaration

        double A, B, C, avg;

        // data input

        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();

        // processing

        avg = ((A * 2) + (B * 3) + (C * 5)) / 10;

        // data output

        System.out.printf("MEDIA = %.1f\n", avg);
    }
}
