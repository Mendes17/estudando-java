package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        method1();
        System.out.println("End of program");

    }

    public static void method1() {
        System.out.println("** method 1 start **");
        method2();
        System.out.println("** method 1 end **");
    }

    public static void method2() {
        System.out.println("** method 2 start **");
        Scanner sc = new Scanner(System.in);

        try { // tenta isso:
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) { // captura exceção
            System.out.println("Invalid position!");
            e.printStackTrace(); // mostra quem gerou a excessão
            sc.next(); // so para conseguir ler a excessão
        } catch (InputMismatchException e) { // captura exceção
            System.out.println("Input error!");
        }

        sc.close();

        System.out.println("** method 2 end **");
    }

}
