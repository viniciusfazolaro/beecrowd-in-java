import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // variables declaration

        int n, i;

        // input

        n = scanner.nextInt();

        // processing and output

        for(i = 1; i <= n; i++){

            if(i % 2 == 0){
                Math.pow(i, 2);
                System.out.println(i + "^2 = " + (int)Math.pow(i, 2));
            }
        }
    }
}