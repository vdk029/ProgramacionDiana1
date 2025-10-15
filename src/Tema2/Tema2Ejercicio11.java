package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dime tres numeros");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if ((num2 == num1 + 1 && num3 == num2 + 1) ||
                (num3 == num2 + 1 && num1 == num3 + 1) ||
                (num1 == num2 + 1 && num3 == num1 + 1) ||
                (num2 == num3 + 1 && num1 == num2 + 1) ||
                (num3 == num1 + 1 && num2 == num3 + 1) ||
                (num1 == num3 + 1 && num2 == num1 + 1)) {
            System.out.println("Son consecutivos");
        } else {
            System.out.println("No son consecutivos");
        }
        input.close();
    }
}

