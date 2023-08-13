import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // variables declaration

        int i, positives = 0;
        double value, total = 0, avg;

        // input and processing

        for(i = 0; i < 6; i++){
            value = scanner.nextDouble();
            if(value > 0){
                positives++;
                total += value;
            }
        }

        avg = total / positives;

        // output

        System.out.println(positives + " valores positivos");

        System.out.printf("%.1f\n", avg);
    }
}