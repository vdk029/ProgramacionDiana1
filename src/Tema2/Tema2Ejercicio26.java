package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("dime un numero");
        int num = input.nextInt();
        int comprobacionPrimo = 0;

        if (num <= 1) {
            System.out.println("no es numero primo");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    comprobacionPrimo++;
                }
            }
            if (comprobacionPrimo == 0) {
                System.out.println("es un numero primo");
            } else {
                System.out.println("no es numero primo");
            }
        }
    }
}