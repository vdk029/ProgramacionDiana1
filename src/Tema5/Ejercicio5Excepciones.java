package Tema5;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio5Excepciones {

    public static void imprimePositivo(int positivo) throws Exception {
        if (positivo < 0) {
            throw new Exception("numero " + positivo + " es negativo solo puedes poner positivos");
        }
        System.out.println("Valor positivo " + positivo);
    }

    public static void imprimeNegativo(int negativo) throws Exception {
        if (negativo >= 0) {

            throw new Exception("El numero" + negativo + " es positivo solo puedes poner negativos.");
        }
        System.out.println("Valor negativo " + negativo);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 0;
        boolean salir = false;

        System.out.println("Dime los numeros");

        while (salir == false) {
            try {
                System.out.print("Introduce un numero: ");
                numero = input.nextInt();

                if (numero == 0) {
                    salir = true;
                } else {
                    imprimePositivo(numero);
                    imprimeNegativo(numero);
                }

            } catch (InputMismatchException exception) {
                System.out.println("el numero no es entero");
                input.nextLine();
            } catch (Exception exception) {
                System.err.println(exception.getMessage());
            }
        }
    }
}