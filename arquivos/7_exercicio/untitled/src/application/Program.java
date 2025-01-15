package application;

import entities.Product;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String path = "A:\\Curso java\\arquivos\\7_exercicio\\source.csv"; // caminho para criar o arquivo com a lista de itens
        List<Product> list = new ArrayList<>(); // armazena os nomes, valores e quantidades dos itens


           for (int i = 0; i < 4; i++) {
               System.out.print("Enter product name: ");
               String name = sc.nextLine(); // captura o nome do item
               System.out.print("Enter product price: ");
               double price = sc.nextDouble(); // captura o valor do item
               System.out.print("Enter product quantity: ");
               int quantity = sc.nextInt(); // captura a quantidade que tem deste item
               sc.nextLine();
               list.add(new Product(name, price, quantity)); // adiciona as informações capturadas na lista
           }

           try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { // vai criar um arquivo.csv com a lista dos itens
               for (Product products : list) {
                   bw.write(products.getName() + "," + String.format("%.2f", products.getPrice()) + "," + products.getQuantity()); // escreve as informações dos itens no arquivo
                   bw.newLine();
               }

               String path2 = "A:\\Curso java\\arquivos\\7_exercicio\\out\\summary.csv"; // caminho para criar um novo arquivo

               try (BufferedWriter bw2 = new BufferedWriter(new FileWriter(path2, true))) {
                   for (Product products : list) {
                       bw2.write(products.getName() + "," + String.format("%.2f", products.totalValue())); // escreve no arquivo o valor total dos itens
                       bw2.newLine();
                   }
               } catch (IOException e) {
                   e.printStackTrace(); // caso tenha alguma excessão
               }

           } catch (IOException e) {
               e.printStackTrace(); // caso tenha alguma excessão
           }

       sc.close();
    }
}

