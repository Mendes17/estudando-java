package Application;

import java.util.Locale;
import java.util.Scanner;

public class Media_pares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 0; // faz com que o while seja verdadeiro

        while(n <= 0) {
            System.out.print("Quantos elementos vai ter o vetor? ");
            n = sc.nextInt(); // captura qual vai ser o tamanho do vetor
        }

        int[] vetor = new int[n]; // vai armazenar os números digitados
        int somaPar = 0; // vai armazenar a soma dos números pares
        int quantidadePares = 0; // vai armazenar a quanrtidade de números pares

        for(int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt(); // captura os números digitados
            if(vetor[i] % 2 == 0) { // ve se é um número par
                somaPar += vetor[i]; // soma o número par
                quantidadePares++; // conta a quantidade de números pares
            }
        }

        double media = (double) somaPar / quantidadePares; // calcula a média dos números pares que existem no vetor

        if(somaPar == 0 || quantidadePares == 0 ) { // caso não tenha números pares no vetor
            System.out.println("NENHUM NÚMERO PAR");
        } else {
            System.out.printf("MEDIA DOS PARES: %.1f", media); // caso tenha números pares no vetor
        }

        sc.close();

    }

}
