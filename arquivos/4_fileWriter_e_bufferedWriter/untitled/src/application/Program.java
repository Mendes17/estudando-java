package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {
        String[] lines = new String[] {"Good morning", "Good afternoon", "Good evening"};
        String path = "A:\\Curso java\\arquivos\\4_fileWriter_e_bufferedWriter\\out.txt"; // este arquivo "out.txt" não existe ainda!

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { // o FileWriter ele cria ou recria o arquivo, para você não recriar precisa colocar este true
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}