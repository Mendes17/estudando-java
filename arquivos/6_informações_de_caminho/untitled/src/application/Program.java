package application;

import java.io.File;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String strPath = sc.nextLine(); // captura o caminho

        File path = new File(strPath);

        System.out.println("getName: " + path.getName()); // Pega o nome do arquivo
        System.out.println("getPath: " + path.getParent()); // Pega o caminho do arquivo
        System.out.println("getPath: " + path.getPath()); // Pega todo o caminho

        sc.close();

    }

}
