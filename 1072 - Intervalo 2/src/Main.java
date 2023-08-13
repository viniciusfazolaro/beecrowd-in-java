import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // variables declaration
        
        int n; // qty of numbers to be read
        int x, i, between = 0, out = 0;

        // input and processing

        n = scanner.nextInt();

        for(i = 0; i < n; i++){
            x = scanner.nextInt();
            
            if(x >= 10 && x <= 20){
                between++;
            }else{
                out++;
            }
        }

        // output

        System.out.println(between + " in");
        System.out.println(out + " out");
    }
}
