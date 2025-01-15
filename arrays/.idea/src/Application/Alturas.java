package Application;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 0; // faz com que o while seja verdadeiro

        while(n <= 0) {
            System.out.print("Quantas pessoas serão digitadas? ");
            n = sc.nextInt(); // captura quantas pessoas serão adicionadas
            sc.nextLine();
        }

        String[] nomes = new String[n]; // armazena os nomes
        int[] idades = new int[n]; // armazena as idades
        double[] alturas = new double[n]; // armazena as alturas

        int posicao = 1;
        for(int i = 0; i < n; i++) { // captura as informações das pessoas (nome, idade e altura)
            System.out.printf("Dados %da pessoa:\n", posicao);
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
            sc.nextLine();
            posicao++;
        }

        double somaAlturas = 0;
        for(int i = 0; i < n; i++) { // soma as alturas
            somaAlturas += alturas[i];
        }

        double media = somaAlturas / n; // pega a média das alturas
        System.out.printf("Altura média: %.2f\n", media);

        int menoresDeDezesseis = 0;
        for(int i = 0; i < n; i++) { // captura quantas pessoas são menores de 16 anos
            if(idades[i] < 16) {
                menoresDeDezesseis = menoresDeDezesseis + 1;
            }
        }

        double calcIdades = ((double) menoresDeDezesseis / n) * 100; // calcula quantos % das pessoas são menores de 16 anos
        System.out.printf("Pessoas menores de 16 anos: %.1f%\n", calcIdades);

        for(int i = 0; i < n; i++) { // mostra o nome dos menores de 16 anos
            if(idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }

}
