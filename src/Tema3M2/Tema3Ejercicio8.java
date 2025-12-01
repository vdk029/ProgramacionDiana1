package Tema3M2;

import java.util.Scanner;

public class Tema3Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        int numero = input.nextInt();
        int number = MyMath.factorialRecursive(numero);
        System.out.println("El factorial recursivo " + numero + " es:" + number);
    }
}
