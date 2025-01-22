package application;

import services.PrintService;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        PrintService<String> s = new PrintService<>(); // instancia o objeto, o "<>" nele você pode definir o tipo que o array vai armazenar

        System.out.print("How many values? ");
        int n = sc.nextInt(); // quantos valores serão armazenados no array

        for (int i = 0; i < n; i++) {
            String value = sc.next(); // captura os valores
            s.addValue(value); // adiciona os valores
        }

        s.print(); // mostra todos os valores dentro do array
        System.out.print("First: " + s.first()); // motra o primeiro valor dentro do array

        sc.close();

    }

}
