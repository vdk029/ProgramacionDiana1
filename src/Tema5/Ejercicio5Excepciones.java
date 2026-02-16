package Tema5;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio5Excepciones {

    // FUNCIÓN 1: Imprime solo positivos
    // Avisamos con "throws Exception" de que esto puede fallar
    public static void imprimePositivo(int p) throws Exception {
        if (p < 0) {
            // Si es negativo, lanzamos el error manualmente
            throw new Exception("Error: El número " + p + " es negativo y yo solo quiero positivos.");
        }
        System.out.println(">> Función Positiva: El valor es " + p);
    }

    // FUNCIÓN 2: Imprime solo negativos
    public static void imprimeNegativo(int n) throws Exception {
        if (n >= 0) {
            // Si es positivo o cero, lanzamos el error
            throw new Exception("Error: El número " + n + " es positivo y yo solo quiero negativos.");
        }
        System.out.println(">> Función Negativa: El valor es " + n);
    }

    // MAIN
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 0;
        boolean salir = false;

        System.out.println("--- TEST DE EXCEPCIONES ---");
        System.out.println("Introduce números para probar las funciones (0 para salir).");

        while (salir == false) {
            try {
                System.out.print("\nIntroduce un número: ");
                numero = input.nextInt();

                if (numero == 0) {
                    salir = true; // Condición de salida
                } else {

                    // PRUEBA 1: Intentamos imprimir como positivo
                    try {
                        imprimePositivo(numero);
                    } catch (Exception e) {
                        System.out.println(e.getMessage()); // Imprime el mensaje que escribimos en el throw
                    }

                    // PRUEBA 2: Intentamos imprimir como negativo
                    try {
                        imprimeNegativo(numero);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("¡Eso no es un número entero!");
                input.nextLine(); // Limpiar el buffer
            }
        }

        System.out.println("Fin del programa.");
        input.close();
    }
}