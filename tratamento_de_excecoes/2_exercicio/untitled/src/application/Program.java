package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws DomainException{

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data:");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawalLimit = sc.nextDouble();
        System.out.println();

        Account account = new Account(number, initialBalance, holder, withdrawalLimit);

        try {
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
            System.out.println(account);
        } catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error:");
        }

        sc.close();

    }

}
