package Application;

import java.util.Locale;
import java.util.Scanner;

public class Abaixo_da_media {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 0; // faz com que o while seja verdadeiro

        while(n <= 0) {
            System.out.print("Quantos elementos vai ter o vetor? ");
            n = sc.nextInt(); // captura quantos números serão adicionados no vetor
        }

        double[] vetor = new double[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble(); // armazena os números digitados no vetor
        }

        double somaVetor = 0; // vai armazenar a soma total dos números do vetor

        for(int i = 0; i < n; i++) {
            somaVetor += vetor[i]; // faz a soma total dos números do vetor
        }

        double media = somaVetor / n; // pega a média do vetor
        System.out.printf("MEDIA DO VETOR = %.3f\n", media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for(int i = 0; i < n; i++) {
            if(vetor[i] < media) { // mostra quais números estão abaixo da média do vetor
                System.out.println(vetor[i]);
            }
        }

        sc.close();

    }

}
