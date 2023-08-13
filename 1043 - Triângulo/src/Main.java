import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // variables declaration

        float a, b, c, perimeter, area;

        // input

        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();

        // processing

        perimeter = (a + b + c);
        area = ((a + b) * c) / 2;

        // output

        if((a + b) > c && (b + c) > a && (a + c) > b){
            System.out.printf("Perimetro = %.1f\n", perimeter);
        } else{
            System.out.printf("Area = %.1f\n", area);
        }
    }
}
