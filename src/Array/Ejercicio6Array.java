package Array;


import java.util.Random;
import java.util.Scanner;

public class Ejercicio6Array {
    public static void main(String[] args) {

        int[] tablero = new int[20];      // -1 será mina
        boolean[] visible = new boolean[20];

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int minas = 0;
        while (minas < 6) {
            int pos = random.nextInt(20);
            if (tablero[pos] != -1) {
                tablero[pos] = -1;
                minas++;
            }
        }

        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i] == -1) {
                continue;
            }

            int contador = 0;

            if (i > 0 && tablero[i - 1] == -1) {
                contador++;
            }
            if (i < 19 && tablero[i + 1] == -1) {
                contador++;
            }

            tablero[i] = contador;
        }

        boolean fin = false;

        while (!fin) {

            System.out.println("\nTablero:");
            for (int i = 0; i < 20; i++) {
                if (visible[i]) {
                    if (tablero[i] == -1) {
                        System.out.print("* ");
                    } else {
                        System.out.print(tablero[i] + " ");
                    }
                } else {
                    System.out.print((i + 1) + " ");
                }
            }
            System.out.println();

            System.out.print("Elige una posicion (1-20): ");
            int eleccion = input.nextInt() - 1;

            if (eleccion < 0 || eleccion > 19) {
                System.out.println("Posicion incorrecta");
                continue;
            }

            visible[eleccion] = true;

            if (tablero[eleccion] == -1) {
                System.out.println("Has pisado una mina. hhas perdido");

                for (int i = 0; i < 20; i++) {
                    visible[i] = true;
                }
                fin = true;
            } else {

                boolean ganado = true;
                for (int i = 0; i < 20; i++) {
                    if (tablero[i] != -1 && !visible[i]) {
                        ganado = false;
                    }
                }

                if (ganado) {
                    System.out.println("Has ganado la partida");
                    fin = true;
                }
            }
        }

        System.out.println("Tablero final:");
        for (int i = 0; i < 20; i++) {
            if (tablero[i] == -1) {
                System.out.print("* ");
            } else {
                System.out.print(tablero[i] + " ");
            }
        }
    }
}

