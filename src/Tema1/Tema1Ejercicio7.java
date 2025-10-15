package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un numero (1-6): ");
        int dado = input.nextInt();

        if (dado >= 1 && dado <= 6) {
            int lado = 7 - dado;
            System.out.println("La cara opuesta es: " + lado);
        } else {
            System.out.println("Numero incorrecto, debe estar entre 1 y 6.");
        }
    }
}