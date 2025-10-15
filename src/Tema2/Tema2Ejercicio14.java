package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dime cuantas personas hay:");
        int personas = input.nextInt();
        System.out.println("Dime los dias que estaran:");
        int dias = input.nextInt();
        double descuento = 15 * 0.25;
        double precioFinal = personas * 15 * dias;

        if (personas < 5 || dias < 7) {
            precioFinal = personas * 15 * dias;
            System.out.println("Precio normal" + precioFinal);
        } else if (personas >= 5 && dias >= 7) {
            precioFinal = precioFinal - descuento;
            System.out.println("Tienes descuento" + precioFinal);

        }
        input.close();
    }
}
