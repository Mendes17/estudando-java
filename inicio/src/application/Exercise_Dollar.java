package application;

import util.CurrencyConvert;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_Dollar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double currencyValue, value, calc;

        System.out.print("Digite o valor do dolar:");
        currencyValue = sc.nextDouble();
        System.out.print("Digite a quantidade de dolar que deseja:");
        value = sc.nextDouble();

        calc = CurrencyConvert.convert(currencyValue, value);

        System.out.printf("Você terá que pagar: R$%.2f", calc);

    }
}
