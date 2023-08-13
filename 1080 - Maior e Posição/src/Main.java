import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // variables declaration

        int[] array = new int[100];
        int i, biggest = 0, position = 0;

        // input and processing

        for(i = 0; i < 100; i++){
            array[i] = scanner.nextInt();

            if(array[i] > biggest){
                biggest = array[i];	
                position = i;
            }
        }

        position++;

        // output

        System.out.println(biggest);
        System.out.println(position);
    }
}
