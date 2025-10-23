package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2Ejercicio29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(101);
        int numero;
        System.out.println("Dime un numero entre 0 y 100: ");
        do {
            numero = input.nextInt();

            if (numero == numeroAleatorio) {
                System.out.println("Has acertado el numero");
            } else if (numero > numeroAleatorio) {
                System.out.println("El numero aleatorio es mas pequeño, sigue intentando:");
            } else {
                System.out.println("El numero aleatorio es mas grande, sigue intentando:");
            }

        } while (numero != numeroAleatorio);

        input.close();
    }
}