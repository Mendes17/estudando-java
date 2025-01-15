package application;

import util.Product;

import java.util.Locale;
import java.util.Scanner;

public class Stock {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Adicione o produto:");
        System.out.print("Nome:");
        String name = sc.nextLine();
        System.out.print("Preço:");
        double price = sc.nextDouble();
        System.out.print("Quantidade:");
        int quantity = sc.nextInt();
        Product product = new Product(name, price);

        System.out.println(product);
        System.out.println();

        System.out.println("Adicione mais no estoque:");
        quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();

        System.out.println("Atualização no estoque: " + product);
        System.out.println();

        System.out.println("Remova do estoque:");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Atualização no estoque: " + product);


        sc.close();

    }
}
