package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int number = sc.nextInt(); // captura o número da conta
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt); // armazena o inicio do contrato
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble(); // captura o valor total do contrato

        Contract obj = new Contract(number, date, totalValue); // instancia no objeto contrato

        System.out.print("Entre com o numero de parcelas: ");
        int n = sc.nextInt(); // captura a quantidade de parcelas

        ContractService contractService = new ContractService(new PaypalService()); // define que o serviço vai ser o paypal

        contractService.processContract(obj, n); // processa o contrato

        System.out.println("Parcelas:");
        for (Installment installment : obj.getInstallments()) {
            System.out.println(installment); // mostra os valores das parcelas com juros
        }

        sc.close();
    }

}
