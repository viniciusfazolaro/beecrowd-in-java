import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // variable declaration

        int A, B, C, D, diff;

        // input

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();

        // processing

        diff = (A * B - C * D);

        // output

        System.out.printf("DIFERENCA = %d\n", diff);
    }
}
