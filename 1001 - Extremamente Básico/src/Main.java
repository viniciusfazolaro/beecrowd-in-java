import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        // variable declaration

        int numbers, sum = 0, i;

        // data input and processing

        for(i = 0; i < 2; i++){
            numbers = scanner.nextInt();
            sum += numbers;
        }

        // data output

        System.out.println("X = " + sum);
        
    }
}
