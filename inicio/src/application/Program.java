package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double radius, c, a, PI;

        System.out.print("Enter the value radius:");
        radius = sc.nextDouble();

        c = Calculator.circumference(radius);
        a = Calculator.area(radius);
        PI = 3.14159265359;

        System.out.printf("The area of the circumference is: %.2f\n", c);
        System.out.printf("The perimeter of the circumference is: %.2f\n", a);
        System.out.printf("The philosopic equation is: %.2f", PI);

        sc.close();

    }
}