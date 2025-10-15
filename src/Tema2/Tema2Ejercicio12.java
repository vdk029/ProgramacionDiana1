package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dime un numero ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int mayor;
        int medio;
        int menor;
        if (num1 > num2 && num1 > num3 && num2 > num3) {
            mayor = num1;
            medio = num2;
            menor = num3;
            System.out.println("Es el mayor" + mayor);
            System.out.println("Es el medio" + medio);
            System.out.println("Es el menor" + menor);
        } else if (num2 > num1 && num2 > num3 && num3 > num1) {
            mayor = num2;
            medio = num3;
            menor = num1;
            System.out.println("Es el mayor" + mayor);
            System.out.println("Es el medio" + medio);
            System.out.println("Es el menor" + menor);
        } else if (num3 > num1 && num3 > num2 && num1 > num2) {
            mayor = num3;
            medio = num1;
            menor = num2;
            System.out.println("Es el mayor" + mayor);
            System.out.println("Es el medio" + medio);
            System.out.println("Es el menor" + menor);
            input.close();
        }
    }
}
