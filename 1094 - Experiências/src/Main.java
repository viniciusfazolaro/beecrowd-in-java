/*Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.

Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.

Entrada
A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).

Saída
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o percentual deve ser apresentado com dois dígitos após o ponto.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // variables declaration

        int testCases, i, qtymouse = 0, qtyrabbit = 0, qtyfrog = 0, qtytotal = 0, qtyanimal = 0;
        char animal;

        // input and processing

        testCases = scanner.nextInt();

        for(i = 0; i < testCases; i++) {
            qtyanimal = scanner.nextInt();
            animal = scanner.next().charAt(0);
            switch (animal) {
            case 'C':
                qtyrabbit += qtyanimal;
                break;
            case 'R':
                qtymouse += qtyanimal;
                break;
            case 'S':
                qtyfrog += qtyanimal;
                break;
            }

            qtyanimal = 0;
        }
        qtytotal = qtymouse + qtyrabbit + qtyfrog;

        // output

        System.out.println("Total: " + qtytotal + " cobaias");
        System.out.println("Total de coelhos: " + qtyrabbit);
        System.out.println("Total de ratos: " + qtymouse);
        System.out.println("Total de sapos: " + qtyfrog);
        System.out.printf("Percentual de coelhos: %.2f %%\n", (double)qtyrabbit / qtytotal * 100);
        System.out.printf("Percentual de ratos: %.2f %%\n", (double)qtymouse / qtytotal * 100);
        System.out.printf("Percentual de sapos: %.2f %%\n", (double)qtyfrog / qtytotal * 100);
    }
}
