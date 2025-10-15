package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dime dos numeros:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int resta1 = num1 - num2;
        int resta2 = num2 - num1;
        if (num1 > num2) {
            System.out.println("el numero 1 es mayor y el resultado es: " + resta1);
        } else {
            System.out.println("el numero 2 es es mayor y el resultado es: " + resta2);
        }
        input.close();
    }
}
