import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // variables declaration

        int i, value, even = 0, odd = 0, positive = 0, negative = 0;

        // input and processing

        for(i = 0; i < 5; i++){
            value = scanner.nextInt();
            if(value % 2 == 0){
                even++;
            }else{
                odd++;
            }
            if(value > 0){
                positive++;
            }else if(value < 0){
                negative++;
            }
        }

        // output

        System.out.println(even + " valor(es) par(es)");
        System.out.println(odd + " valor(es) impar(es)");
        System.out.println(positive + " valor(es) positivo(s)");
        System.out.println(negative + " valor(es) negativo(s)");
    }
}
