package application;

import entities.LegalEntity;
import entities.NaturalPerson;
import entities.Taxes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Taxes> list = new ArrayList<>();
        double totalTaxes = 0.0;

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char response = sc.next().charAt(0);
            sc.nextLine();
            switch (response) {
                case 'i':
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Anual Income: ");
                    double income = sc.nextDouble();
                    System.out.print("Health expenditures: ");
                    double health = sc.nextDouble();
                    list.add(new NaturalPerson(name, income, health));
                    break;
                case 'c':
                    System.out.print("Name: ");
                    String name2 = sc.nextLine();
                    System.out.print("Anual Income: ");
                    double income2 = sc.nextDouble();
                    System.out.print("Number of employees: ");
                    int employees = sc.nextInt();
                    list.add(new LegalEntity(name2, income2, employees));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID:");
        for (Taxes taxes : list) {
            System.out.println(taxes.getName() + ": $ " + String.format("%.2f", taxes.taxesCalculation()));
            totalTaxes += taxes.taxesCalculation();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));

        sc.close();

    }

}
