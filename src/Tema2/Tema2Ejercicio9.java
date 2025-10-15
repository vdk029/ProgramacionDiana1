package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuantos dolares quieres converir?: ");
        double numDolares = input.nextDouble();
        double euros = 0.86;
        double conversor = euros * numDolares;

        System.out.println("has convertido: " + conversor);
        input.close();
    }
}


