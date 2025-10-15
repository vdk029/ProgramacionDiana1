package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dime el numero 1:");
        int num1 = input.nextInt();
        System.out.println("Dime el numero 2:");
        int num2 = input.nextInt();
        System.out.println("Dime el numero 3:");
        int num3 = input.nextInt();
        double mediaSiDecimal = (double) (num1 + num2 + num3) / 3; //forzar a que haga operacion double aunque variable sea int
        int mediaNoDecimal = (num1 + num2 + num3) / 3;
        System.out.println("La media con decimal:" + mediaSiDecimal);
        System.out.println("La media sin decimal:" + mediaNoDecimal);
        input.close();
    }
}
