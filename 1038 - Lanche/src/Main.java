import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // variables declaration

        int code, quantity;
        double total = 0, price = 0;

        // input

        code = scanner.nextInt();
        quantity = scanner.nextInt();

        // processing

        switch(code){
        case 1:
            price = 4.00;
            break;
        case 2: 
            price = 4.50;
            break;
        case 3:
            price = 5.00;
            break;
        case 4:
            price = 2.00;
            break;
        case 5:
            price = 1.50;
            break;
        }

        total = price * quantity;

        // output

        System.out.printf("Total: R$ %.2f\n", total);
    }
}
