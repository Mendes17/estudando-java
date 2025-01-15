package Application;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 0; // mantém o while verdadeiro

        while(n <= 0 ) {
            System.out.print("Quantos números você vai digitar? ");
            n = sc.nextInt(); // captura a quantidade de números que vão ser adicionados
        }

        double[] vect = new double[n];

        for(int i = 0; i < n; i++) { // adiciona os números no vetor
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("VALORES = ");
        for(int i = 0; i < n; i++) { // mostra os valores que estão dentro do vetor
            System.out.print(vect[i] + " ");
        }
        System.out.println();
        double soma = 0;

        for(int i = 0; i < n; i++) { // soma todos os valores dentro do vetor
            soma += vect[i];
        }
        System.out.printf("SOMA = %.2f\n", soma);

        double media = soma / n; // calcula a média do vetor
        System.out.printf("MEDIA = %.2f\n", media);

        sc.close();
    }

}
