package Tema3M1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void positivos(int num) {
        int comprobacionPrimo = 0;
        if (num <= 1) {
            System.out.println("no es numero primo");
        } else
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
    public static void main(String[] args) {
        System.out.println("Dime un numero");
        Scanner input=new Scanner(System.in);
        positivos(input.nextInt());
    }
}

        


