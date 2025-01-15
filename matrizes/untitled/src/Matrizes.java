import java.util.Locale;
import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // captura o tamanho da matriz (nxn)

        int[][] matriz = new int[n][n]; // cria a matriz

        for (int i = 0; i < matriz.length; i++) { // percorrer pelas linhas
            for (int j = 0; j < matriz[i].length; j++) { // percorrer pelas colunas
                matriz[i][j] = sc.nextInt(); // adiciona os números na matriz
            }
        }

        System.out.println("Main diagona: ");
        for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][i] + " "); // percorre  a diagonal da matriz e mostra os números
        }
        System.out.println();

        int count = 0;
        System.out.println("Negative numbers: ");
        for (int i = 0; i < matriz.length; i++) { // conta quantos números negativos existem na matriz
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.print(count);

        sc.close();

    }
}