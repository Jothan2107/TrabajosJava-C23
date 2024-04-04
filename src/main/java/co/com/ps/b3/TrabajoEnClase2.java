package co.com.ps.b3;

import java.util.Scanner;

public class TrabajoEnClase2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba Primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Escriba Segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("La Suma de :" + num1 + " + " + num2 + " = " +(num1 + num2));
        System.out.println("La Resta de :" + num1 + " + " + num2 + " = " +(num1 - num2));
        System.out.println("La Multiplicación de :" + num1 + " + " + num2 + " = " +(num1 * num2));
        System.out.println("La División entre :" + num1 + " + " + num2 + " = " +(num1 / num2));
        System.out.println("La Modulo de :" + num1 + " + " + num2 + " = " +(num1 % num2));

    }
}
