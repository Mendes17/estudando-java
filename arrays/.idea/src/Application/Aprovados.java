package Application;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 0; // faz com que o while seja verdadeiro

        while(n <= 0) {
            System.out.print("Quantos alunos serão digitados? ");
            n = sc.nextInt(); // define o tamanho do vetor
            }

        String[] nomesAlunos = new String[n];
        double[] bimestre1 = new double[n];
        double[] bimestre2 = new double[n];
        int posicaoDados = 1;

        for(int i = 0; i < n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", posicaoDados);
            nomesAlunos[i] = sc.nextLine(); // armazena os nomes digitados
            sc.nextLine(); // captura o clique adicional que o input solta
            bimestre1[i] = sc.nextDouble(); // armazena a nota do primeiro bimestre
            bimestre2[i] = sc.nextDouble(); // armazena a nota do segundo bimestre
            posicaoDados++; // aumenta a posição
        }

        double media = 0; // vai armazenar a média dos alunos
        System.out.println("Alunos aprovados:");
        for(int i = 0; i < n; i++) {
            media = (bimestre1[i] + bimestre2[i]) / 2.0; // calcula a média dos alunos
            if(media >= 6) { // mostra o nome dos alunos aprovados
                System.out.printf("%s\n", nomesAlunos[i]);
            }
        }

        sc.close();

    }

}
