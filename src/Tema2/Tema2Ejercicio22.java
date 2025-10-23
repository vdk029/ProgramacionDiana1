package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dime un numero");
        int numero = input.nextInt();
        int contador = 0;

        while (numero > 0) {
            numero = numero / 10;
            contador++;
        }
        System.out.println("el numero tiene " + contador + " cifras");
        input.close();
    }

}
