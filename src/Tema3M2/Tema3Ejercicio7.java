package Tema3M2;

import java.util.Scanner;

public class Tema3Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe un numero:");
        int number = input.nextInt();
        int numero = MyMath.factorial(number);
        System.out.println("El factorial de " + numero + " es :" + number);
    }
}
