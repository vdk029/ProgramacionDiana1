package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dime el primer numero");
        int num1 = input.nextInt();
        System.out.println("Dime el segundo numero");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("El mayor es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("Los dos numeros son iguales.");
        }
        input.close();
    }
}