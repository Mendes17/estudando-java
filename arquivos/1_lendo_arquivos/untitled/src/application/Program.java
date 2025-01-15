package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        File file = new File("A:\\Curso java\\arquivos\\1_lendo_arquivos\\in.txt"); // encontra o arquivo que vai ser lido
        Scanner sc = null; // inicia o Scanner
        try {
            sc = new Scanner(file); // faz a leitura do arquivo
            while(sc.hasNextLine()) { // enquanto tiver algo na proxima linha
                System.out.println(sc.nextLine()); // imprima
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage()); // caso de uma exceção
        } finally {
            if (sc != null) { // fecha o scanner
                sc.close();
            }
        }
    }

}
