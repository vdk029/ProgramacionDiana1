package Tema3M2;

import java.util.Scanner;

public class Tema3Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dime un numero ");
        int number = input.nextInt();
        MyMath.isPrime(number);
        if (MyMath.isPrime(number)) {
            System.out.println("El numero " + number + " es primo.");
        } else {
            System.out.println("El numero " + number + " no es primo.");
        }


    }
}
