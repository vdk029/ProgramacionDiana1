package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuantos euros quieres converir?: ");
        double numEuros = input.nextDouble();
        double dolares = 1.17;
        double conversor = dolares * numEuros;

        System.out.println("has convertido: " + conversor);
        input.close();
    }
}
