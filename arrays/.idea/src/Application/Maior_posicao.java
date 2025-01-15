package Application;

import java.util.Locale;
import java.util.Scanner;

public class Maior_posicao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 0; // faz com que o while seja verdadeiro

        while(n <= 0) {
            System.out.print("Quantos números você vai digitar? ");
            n = sc.nextInt(); // captura quantos números serão adicionador no vetor
        }

        double[] num = new double[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            num[i] = sc.nextDouble(); // adiciona os números no vetor
        }

        System.out.println();

        System.out.print("MAIOR VALOR = ");
        double maior = 0; // vai armazenar o maior número
        int posicao = 0; // vai armazenar o index do maior número
        for(int i = 0; i < n; i++) {
           if(num[i] > maior) { // captura maior número e a posição dele
               maior = num[i];
               posicao = i;
           }
        }
        System.out.println(maior);
        System.out.printf("POSIÇÃO DO MAIOR VALOR = %d", posicao);

        sc.close();

    }

}
