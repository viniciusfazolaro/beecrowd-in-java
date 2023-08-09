import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // variable declaration

        double A = 0, B = 0, avg;

        // data input

        A = scanner.nextDouble();

        B = scanner.nextDouble();

        // processing

        avg = ((A * 3.5) + (B * 7.5)) / 11;

        // data output

        System.out.printf("MEDIA = %.5f\n", avg);
    }
}
