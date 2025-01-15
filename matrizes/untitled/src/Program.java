import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(); // captura a quantidade de linhas
        int n = sc.nextInt(); // captura a quantidade de colunas

        int[][] mat = new int[m][n]; // cria a matriz

        for (int i = 0; i < mat.length; i++) { // percorre pelas linhas da matriz
            for (int j = 0; j < mat[i].length; j++) { // percorre pelas colunas da matriz
                mat[i][j] = sc.nextInt(); // adiciona os números na matriz
            }
        }

        int numComparar = sc.nextInt(); // captura o número que é para ser encontrado

        for (int i = 0; i < mat.length; i++) { // percorre pelas linhas da matriz
            for (int j = 0; j < mat[i].length; j++) { // percorre pelas colunas da matriz
                if (mat[i][j] == numComparar) { // mostra a posição do número escolhido
                    System.out.println("Position: " + i + "," + j);
                    if (i > 0) { // mostra qual número esta posicionado acima dele
                        System.out.println("Número acima: " + mat[i - 1][j]);
                    }
                    if (j > 0) { // mostra qual número está a posicionado a esquerda dele
                        System.out.println("Número a esquerda: " + mat[i][j - 1]);
                    }
                    if (j < mat[i].length - 1) { // mostra qual número esta posicionado a direita dele
                        System.out.println("Número a direita: " + mat[i][j + 1]);
                    }
                    if (i < mat.length - 1) { // mostra qual número esta posicionado abaixo dele
                        System.out.println("Número abaixo: " + mat[i + 1][j]);
                    }
                    System.out.println();
                }
            }
        }
        sc.close();

    }

}
