import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        // declaração de variáveis

        int numbers, sum = 0, i;

        // entrada de dados e processamento

        for(i = 0; i < 2; i++){
            numbers = scanner.nextInt();
            sum += numbers;
        }

        // saída de dados

        System.out.println("X = " + sum);
        
    }
}