package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List<Product> products = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported  (c/u/i)? ");
            char choice = sc.next().charAt(0);
            sc.nextLine();
            switch (choice) {
                    case 'c':
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Price: ");
                        Double price = sc.nextDouble();
                        Product product = new Product(name, price);
                        products.add(product);
                        break;
                    case 'u':
                        System.out.print("Name: ");
                        String name2 = sc.nextLine();
                        System.out.print("Price: ");
                        Double price2 = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Manufactured date (DD/MM/YYYY): ");
                        String date = sc.nextLine();
                        Date manuFacturedDate = sdf.parse(date);
                        Product product2 = new UsedProduct(name2, price2, manuFacturedDate);
                        products.add(product2);
                        break;
                    case 'i':
                        System.out.print("Name: ");
                        String name3 = sc.nextLine();
                        System.out.print("Price: ");
                        Double price3 = sc.nextDouble();
                        System.out.print("Custom fee: ");
                        Double fee = sc.nextDouble();
                        Product product3 = new ImportedProduct(name3, price3, fee);
                        products.add(product3);
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        break;
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product product : products) {
            System.out.print(product);
        }

        sc.close();

    }

}
