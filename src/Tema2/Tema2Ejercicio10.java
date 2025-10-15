package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dime los 3 numeros");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " A es el mayor");
        } else if (num2 > num3 && num2 > num1) {
            System.out.println(num2 + " B es el mayor");
        } else {
            System.out.println(num3 + " C es el mayor");
        }
        input.close();
    }
}
