package application;

import util.DataBank;

import java.util.Locale;
import java.util.Scanner;

public class UserBank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DataBank account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if(response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new DataBank(holder, number, initialDeposit);
        } else {
            account = new DataBank(holder, number);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Update account data:");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Update account data:");
        System.out.println(account);

        sc.close();

    }
}
