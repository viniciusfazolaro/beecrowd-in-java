import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        // variable declaration

        int A, B, sum;

        // data input

        A = scanner.nextInt();
        B = scanner.nextInt();

        // processing

        sum = A + B;

        // data output

        System.out.println("SOMA = " + sum);
    }
}
