package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dime el numero 1:");
        int num1 = input.nextInt();
        System.out.println("Dime el numero 2:");
        int num2 = input.nextInt();
        System.out.println("Dime el numero 3:");
        int num3 = input.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero 1 es el mayor");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero 2 es el mayor");
        } else {
            System.out.println("El numero 3 es mayor ");
        }
        input.close();
    }
}
