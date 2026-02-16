package Tema5;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio3Excepciones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] vector = new double[5];

        System.out.println("introduce 5 numeros");
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("intruce la posiciion " + (i + 1));
                vector[i] = input.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("Numero invalido ponlo de nuevo");
                input.nextLine();
                vector[i] = input.nextInt();
            }
        }
    }
}
