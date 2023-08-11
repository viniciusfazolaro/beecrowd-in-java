/*Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.
*/

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // variables declaration
        
        double A, B, C, delta, R1, R2;

        // input

        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();

        // processing

        delta = (4 * A * C);
        
        if(Math.pow(B, 2) - delta < 0 || A <= 0){
            System.out.println("Impossivel calcular");
        }else{
            R1 = (-B + Math.sqrt(Math.pow(B, 2) - delta)) / (2 * A);
            R2 = (-B - Math.sqrt(Math.pow(B, 2) - delta)) / (2 * A);

            // output

            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }
    }
}
