import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // variable declaration

        double radius, pi = 3.14159, area;

        // data input

        radius = scanner.nextDouble();

        // processing
        
        area = Math.pow(radius, 2) * pi;

        // data output

        System.out.printf("A=%.4f\n", area);
    }
}
