import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // variables declaration

        int[] array = new int[3], ordenedArray = new int[3];
        int i, j, aux;

        // input

        for(i = 0; i < 3; i++){
            array[i] = scanner.nextInt();
        }

        ordenedArray = array.clone();

        // processing and output

        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                if(ordenedArray[i] < ordenedArray[j]){
                    aux = ordenedArray[i];
                    ordenedArray[i] = ordenedArray[j];
                    ordenedArray[j] = aux;
                }
            }
        }

        // output

        for(i = 0; i < 3; i++){
            System.out.println(ordenedArray[i]);
        }

        System.out.println("");

        for(i = 0; i < 3; i++){
            System.out.println(array[i]);
        }
    }
}