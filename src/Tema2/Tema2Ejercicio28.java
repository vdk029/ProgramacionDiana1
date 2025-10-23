package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2Ejercicio28 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int numeroGanador = random.nextInt(99999);
        int numeroUsuario ;

        System.out.println("Loteria");
        System.out.println("Tienes 5 intentos para adivinar el numero ganador");

        for (int intento = 1; intento <= 5; intento++) {
            System.out.print("dime tus numeros " + intento + ": ");
             numeroUsuario = input.nextInt();

            if (numeroUsuario == numeroGanador) {
                System.out.println("Has ganado con el numero " + numeroUsuario);
            } else {
                System.out.println("No has ganado.");
            }
        }
        System.out.println("El numero ganador era: " + numeroGanador);
        input.close();
    }
}
