import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // variables declaration

        int start, end;
        int sbig, ebig;

        // input

        start = scanner.nextInt();
        end = scanner.nextInt();

        // processing and output

        if(start == end){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else if(start > end){
            sbig = 24 - start + end;
            System.out.println("O JOGO DUROU " + sbig + " HORA(S)");
        } else{
            ebig = end - start;
            System.out.println("O JOGO DUROU " + ebig + " HORA(S)");
        }
    }
}