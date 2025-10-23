package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dime 2 numeros");
        int numA = input.nextInt();
        int numB = input.nextInt();
        if (numA < numB) {
            for (int i = numA + 1; i <= numB; i++) {
                if (i % 2 != 0) {
                    System.out.println("resultado" + i);
                }
            }
        } else {
            System.out.println("No imprimimos cuando A es mayor que B");
        }

        input.close();
    }
}

