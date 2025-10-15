package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dime un numero:");
        int num = input.nextInt();
        if (num == 0) {
            System.out.println("El numero es cero");
        } else if (num > 0) {
            System.out.println("El numero positivo");
        } else {
            System.out.println("El numero negativo");
        }
        input.close();
    }
}
