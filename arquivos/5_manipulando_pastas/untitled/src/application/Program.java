package application;

import java.io.File;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine(); // captura o caminho da pasta

        File path = new File(strPath); // armazena a pasta

        File[] folders = path.listFiles(File::isDirectory); // captura somente diretórios(pastas) dentro pasta escolhida
        System.out.println("FOLDERS:");
        for (File folder : folders) {
            System.out.println(folder); // mostra os diretórios existentes
        }

        File[] files = path.listFiles(File::isFile); // captura somente os arquivos da pasta escolhida
        System.out.println("FILES:");
        for (File file : files) {
            System.out.println(file); // mostra os arquivos existentes
        }

        boolean sucess = new File(strPath + "\\subdir").mkdir(); // cria uma subpasta no diretório especificado
        System.out.println("Directory created successfully: " + sucess); // alerta se foi criado ou não

        sc.close();

    }

}
