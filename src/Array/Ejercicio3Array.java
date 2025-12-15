package Array;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3Array {
    public static void main(String[] args) {

        int[] array = new int[15];


        Random rand = new Random();
        int moscaPosicion = rand.nextInt(15);
        array[moscaPosicion] = 1;


        Scanner scanner = new Scanner(System.in);
        int intentos = 0;

        System.out.println("Bienvenido al juego");
        System.out.println("Elige una posicion entre 1 y 15 para intentar atrapar la mosca");
        boolean fin = false;
        while (!fin) {
            intentos++;

            System.out.print("Elige una posicion entre 1 y 15: ");
            int seleccion = scanner.nextInt();


            if (seleccion < 1 || seleccion > 15) {
                System.out.println("Pon una posicion valida entre 1 y 15");

            }
            seleccion--;


            if (seleccion == moscaPosicion) {
                System.out.println("Atrapaste a la mosca en " + (seleccion + 1) + " en " + intentos + " intentos");
                fin = true;
            } else if (moscaPosicion == seleccion - 1 || seleccion == moscaPosicion + 1) {
                System.out.println("");

                if (moscaPosicion > 0 && moscaPosicion < 14) {
                    moscaPosicion = rand.nextInt(15);
                } else if (moscaPosicion == 0) {
                    moscaPosicion = 1;
                } else if (moscaPosicion == 14) {
                    moscaPosicion = 13;
                }
            } else {
                System.out.println("No has atrapado a la mosca. Llevas  " + intentos + "intentos");
            }
        }
    }
}

