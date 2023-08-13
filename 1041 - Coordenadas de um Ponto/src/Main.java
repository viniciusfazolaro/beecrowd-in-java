import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // variables declaration

        double x, y;

        // input

        x = scanner.nextDouble();
        y = scanner.nextDouble();

        // processing

        if(x > 0 && y < 0){
            System.out.println("Q4");
        } else if(x > 0 && y > 0){
            System.out.println("Q1");
        } else if(x < 0 && y > 0){
            System.out.println("Q2");
        } else if(x < 0 && y < 0){
            System.out.println("Q3");
        } else if(x == 0 && y == 0){
            System.out.println("Origem");
        } else if(x == 0 && y != 0){
            System.out.println("Eixo Y");
        } else if(x != 0 && y == 0){
            System.out.println("Eixo X");
        }
    }
}
