/*Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados.

Entrada
Seis valores, negativos e/ou positivos.

Saída
Imprima uma mensagem dizendo quantos valores positivos foram lidos. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // variables declaration

        int i, positives = 0;
        double value;

        // input and processing

        for(i = 0; i < 6; i++){
            value = scanner.nextDouble();
            if(value > 0){
                positives++;
            }
        }

        // output

        System.out.println(positives + " valores positivos");
    }
}
