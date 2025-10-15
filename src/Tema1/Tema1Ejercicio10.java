package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el primer numero real: ");
        double num1 = input.nextDouble();

        System.out.print("Introduce el segundo numero real: ");
        double num2 = input.nextDouble();
        double suma = num1 + num2;
        double producto = num1 * num2;
        double resto;
        double division;

        if (num2 != 0) {
            division = num1 / num2;
            resto = num1 % num2;
            System.out.println("la suma es: " + suma);
            System.out.println("el producto es: " + producto);
            System.out.println("la division es: " + division);
            System.out.println("ll resto es: " + resto);
        } else {
            System.out.println("la suma es: " + suma);
            System.out.println("el producto es: " + producto);
            System.out.println("no se puede dividir y calcular resto 0.");
        }
        input.close();
    }
}