package Application;

import java.util.Locale;
import java.util.Scanner;

public class Numeros_negativos {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 11; // Mantém o while como verdadeiro.

        while (n > 10) {
            System.out.println("Digite a quantidade de números que deseja adicionar: ");
            n = sc.nextInt(); // Captura o tamanho do array
        }

        int[] vect = new int[n]; // "n" Define o tamanho do array com base no que o usuario digitou

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt(); // armazena os números no vetor
        }

        if(vect.length > 0) { // verifica se o vetor está vazio
            System.out.println("NÚMEROS NEGATIVOS:");
            int verificador = 0; // mostra se tem número negativo ou não 0 = false e 1 = true

            for (int i = 0; i < vect.length; i++) {
                if (vect[i] < 0) { // busca por números negativos
                    verificador = 1; // alterna para 1 pois existe números negativos
                    System.out.printf("%d\n", vect[i]);
                }
            }

            if (verificador == 0) { // caso não tenha números negativos
                System.out.println("Nenhum número negativo no vetor!");
            }
        } else {
            System.out.println("O vetor está vazio!");
        }


        sc.close();

    }

}
