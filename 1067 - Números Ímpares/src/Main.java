import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // variables declaration

        int value, i;

        // input

        value = scanner.nextInt();

        // processing and output

        for(i = 0; i <= value; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
