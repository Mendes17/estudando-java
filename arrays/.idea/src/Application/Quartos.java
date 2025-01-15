package Application;

import java.util.Locale;
import java.util.Scanner;

public class Quartos {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 0; // faz com que o whie seja verdadeiro

        while(n <= 0) {
            System.out.print("Quantos quartos serão alugados? ");
            n = sc.nextInt(); // captura a quantidade de quartos que serão alugados
        }

        String[] nomes = new String[10]; // armazena os nomes para mostrar no registro
        String nome = "";  // armazena o nome temporariamente
        String[] emails = new String[10]; // armazena os emais
        String email = ""; // armazena o email temporariamente
        int[] quartos = new int[10]; // armazena os quartos alugados
        int q = 0; // armazena o quarto alugado temporariamente
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            System.out.printf("Registro %d:\n", i + 1);
            System.out.print("Nome: ");
            nome = sc.nextLine(); // captura o nome do cliente
            System.out.print("Email: ");
            email = sc.nextLine(); // captura o email do cliente
            System.out.print("Quarto: ");
            q = sc.nextInt(); // captura o quarto escolhido pelo o cliente
            sc.nextLine();
            nomes[q] = nome; // pega a variavel que guarda temporariamente e adiciona nos registros
            emails[q] = email;
            quartos[q] = q;
            System.out.println();
        }

        System.out.println("Quartos alugados:");

        for(int i = 0; i < 10; i++) { // mostra os quartos alugados e os dados de quem alugou]7
            if(nomes[i] != null && emails[i] != null && quartos[i] != 0) {
                System.out.printf("%d: %s, %s\n", quartos[i], nomes[i], emails[i]);
            }
        }



        sc.close();

    }

}
