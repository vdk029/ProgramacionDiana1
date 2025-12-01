package Tema3M2;

import java.util.Scanner;

public class Tema3Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int number = input.nextInt();
        int contadorPares = MyMath.numberPar(number);
        System.out.println("numeros pares " + contadorPares);
    }
}

