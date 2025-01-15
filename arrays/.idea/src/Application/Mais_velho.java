package Application;

import java.util.Locale;
import java.util.Scanner;

public class Mais_velho {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 0; // faz que o while seja verdadeiro

        while(n <= 0)  {
            System.out.print("Quantas pessoas você vai digitar? ");
            n = sc.nextInt(); // define o tamanho do vetor
        }

        String[] nomes = new String[n]; // armazena os nomes
        int[] idades = new int[n]; // armazena as idades
        int posicao = 1; // define a posição dos dados dentro do vetor

        for(int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", posicao);
            System.out.print("Nome: ");
            nomes[i] = sc.next(); // adiciona o nome no vetor
            sc.nextLine(); // captura o clique adicional
            System.out.print("Idade: ");
            idades[i] = sc.nextInt(); // adiciona a idade no vetor
            posicao++; // aumenta a posição para adicionar os dados da próxima pessoa
        }

        int maiorIdade = 0; // vai armazenar a maior idade
        String pessoaMaisVelha = nomes[0]; // vai armazenar o nome da pessoa com a maior idade
        for(int i = 0; i < n; i++) {
            if(idades[i] > maiorIdade) { // acha a maior idade
                maiorIdade = idades[i]; // adiciona a maior idade
                pessoaMaisVelha = nomes[i]; // adiciona o nome da pessoa com a maior idade
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s", pessoaMaisVelha);

        sc.close();

    }

}
