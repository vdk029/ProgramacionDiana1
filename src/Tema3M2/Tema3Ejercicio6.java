package Tema3M2;

import java.util.Scanner;

public class Tema3Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int number = input.nextInt();
        int numeroImpar = MyMath.numberImpar(number);
        System.out.println("numeros impares " + numeroImpar);

    }

}

