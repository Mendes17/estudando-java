package application;

import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble(); // captura a quantia
        System.out.print("Months: ");
        int months = sc.nextInt(); // captura a quantidade de meses

        InterestService isB = new BrazilInterestService(2.0); // instancia o tipo do serviço e define a taxa de juros (2%)
        double brazilPayment = isB.payment(amount, months); // chama o método e adiciona as variáveis como parâmetro
        InterestService isU = new UsaInterestService(1.0);
        double usaPayment = isU.payment(amount, months);

        System.out.println("Brazil payment after " + months + " months: " + String.format("%.2f", brazilPayment)); // imprime o valor com o juros
        System.out.println("USA payment after " + months + " months: " + String.format("%.2f", usaPayment));

        sc.close();

    }

}
