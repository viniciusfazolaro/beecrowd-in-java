import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // variable declaration

        int number, PROD = 1, i;

        // data input and processing

        for(i = 0; i < 2; i++){

            number = scanner.nextInt();

            PROD *= number;
        }

        // data output

        System.out.println("PROD = " + PROD);

    }
}
