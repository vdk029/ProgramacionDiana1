package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("dime un numero:");
        double numero = input.nextDouble();

        if (numero < 0) {
            System.out.println("Error: no se puede calcular la raiz de un numero negativo.");
        } else {
            double raiz = Math.sqrt(numero);
            System.out.println("La raiz cuadrada es: " + raiz);
        }

        input.close();
    }
}

