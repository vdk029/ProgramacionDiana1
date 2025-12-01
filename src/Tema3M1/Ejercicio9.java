package Tema3M1;

import java.util.Scanner;

public class Ejercicio9 {

    public static void triangulo(char caracter, int lineas) {

        for (int i = 1; i <= lineas; i++) {

            for (int e = 0; e < lineas - i; e++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print(caracter);
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        System.out.println("Dime las lineas del triangulo");
        Scanner input = new Scanner(System.in);
        int lineas = input.nextInt();
        char caracter = 'a';
        triangulo(caracter, lineas);
    }
}
