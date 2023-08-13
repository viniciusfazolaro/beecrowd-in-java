import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // variables declaration

        int x, y, i, sum = 0, max, min;

        // input

        x = scanner.nextInt();
        y = scanner.nextInt();

        // processing

        if(x > y){
            max = x;
            min = y;
        } else{
            min = x;
            max = y;
        }

        for(i = min + 1; max > i; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }

        // output

        System.out.println(sum);
    }
}
