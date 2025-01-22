package application;

import entities.Client;
import entities.Order;
import entities.OrderItems;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDate = sc.nextLine();

        Client client = new Client(name, email, sdf.parse(birthDate));

        System.out.println();

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.nextLine();
        Date date = new Date();

        System.out.println();

        System.out.print("How many items to this order? ");
        int howManyItems = sc.nextInt();
        sc.nextLine();
        System.out.println();
        Order order = new Order(date, OrderStatus.valueOf(status), client);
        for (int i = 1; i <= howManyItems; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();
            System.out.println();
            Product product = new Product(productName, productPrice);
            product.addItem(product);
            OrderItems item = new OrderItems(quantity, productPrice, product);
            order.addItem(item);
        }
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        sc.close();

    }

}
