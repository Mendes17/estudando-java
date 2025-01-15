package Application;

import java.util.Locale;
import java.util.Scanner;

public class Numeros_pares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 0; // faz com que o while seja verdadeiro

        while(n <= 0) {
            System.out.print("Quantos números você vai digitar? ");
            n = sc.nextInt(); // captura quantos números serão adicionados
        }

        int[] vect = new int[n];

        for(int i = 0; i < n; i++) { // armazena os números digitados
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println();

        System.out.println("NÚMEROS PARES:");
        int quantidadePares = 0;
        for(int i = 0; i < n; i++) {
            if(vect[i] % 2 == 0) { // seleciona qual número é par
                System.out.print(vect[i] + " ");
                quantidadePares++; // conta quantos números pares tem dentro do vetor
            }
        }

        System.out.printf("\n\nQUANTIDADE DE PARES: %d", quantidadePares);

        sc.close();

    }

}
