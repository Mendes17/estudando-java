package Application;

import entities.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 0;
        List<Employees> list = new ArrayList<Employees>();

        while (n <= 0) {
            System.out.print("Quantos empregados serão registrados? ");
            n = sc.nextInt();
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            System.out.printf("Empregado #%d:\n", i);
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();
            list.add(new Employees(nome, id, salario));
            System.out.println();
        }
        System.out.print("Digite o id do empregado que deseja aumentar o salario: ");
        int id = sc.nextInt();
        Employees emp = list.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
        Double porcentagem;
        if (emp == null) {
            System.out.println("Este id não existe!");
        } else {
            System.out.print("Coloque quantos porcento deseja aumentar o salario: ");
            porcentagem = sc.nextDouble();
            for (Employees emp2 : list) {
                if (emp2.getId() == id) {
                    emp2.setSalario(emp2.aumentarSalario(porcentagem));
                }
            }
        }
        System.out.println();
        System.out.println("Lista de empregados:");
        for (Employees emp2 : list) {
            System.out.printf("%d, %s, %.2f\n", emp2.getId(), emp2.getNome(), emp2.getSalario());
        }
        sc.close();

    }

}
