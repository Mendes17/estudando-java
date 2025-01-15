package Application;

import java.util.Locale;
import java.util.Scanner;

public class Somar_vetores {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 0; // faz com que o while seja verdadeiro

        while(n <= 0) {
            System.out.print("Quantos valores vai ter cada vetor? ");
            n = sc.nextInt(); // captura quantos números irão ter em cada vetor
        }

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt(); // adiciona os números no vetor A
        }
        System.out.println("Digite os valores do vetor B:");
        for(int i = 0; i < n; i++) {
            b[i] = sc.nextInt(); // adiciona os números no vetor B
        }

        for(int i = 0; i < n; i++) {
            c[i] = a[i] + b[i]; // soma os números do vetor A e B e adiciona no C
        }

        System.out.println("VETOR RESULTANTE:");
        for(int i = 0; i < n; i++) {
            System.out.printf("%d\n", c[i]); // Mostra o resultado da soma dos vetores A e B
        }

        sc.close();

    }

}
