package Application;

import java.util.Locale;
import java.util.Scanner;

public class  Dados_pessoas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 0; // faz com que o while seja verdadeiro

        while(n <= 0) {
            System.out.print("Quantas pessoas serão digitadas?");
            n = sc.nextInt(); // define o tamanho dos vetores
        }

        double[] alturas = new double[n];
        String[] generos = new String[n];

        for(int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            alturas[i] = sc.nextDouble(); // adiciona a altura no vetor
            System.out.printf("Genero da %da pessoa: ", i + 1);
            generos[i] = sc.next(); // adiciona o genero no vetor
        }

        double menorAltura = alturas[0];
        double maiorAltura = 0;

        for(int i = 0; i < n; i++) {
            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i]; // armazena a menor altura
            }
            if(alturas[i] > maiorAltura) {
                maiorAltura = alturas[i]; // armazena a maior altura
            }
        }

        double somaAltura = 0;
        int quantidadeMulheres = 0;
        int quantidadeHomens = 0;

        for(int i = 0; i < n; i++) {
            if(generos[i] == "M") {
              quantidadeHomens++; // conta a quantidade de homens
            } else {
                somaAltura += alturas[i]; // soma a altura das mulheres
                quantidadeMulheres++; // conta a quantidade de mulheres
            }
        }

        double media = somaAltura / (double) quantidadeMulheres; // calcula a media das alturas das mulheres

        System.out.printf("Menor altura: %.2f\n", menorAltura);
        System.out.printf("Maior altura: %.2f\n", maiorAltura);
        System.out.printf("Media das alturas das mulheres: %.2f\n", media);
        System.out.printf("Quantidade de homens: %d\n", quantidadeHomens);

        sc.close();

    }

}
