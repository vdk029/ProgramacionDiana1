package Tema5;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio4Excepciones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = (int) (Math.random() * 100) + 1;
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10) + 1;

            System.out.println("Se ha creado un vector de tamaño " + n);
            boolean salir = false;
            int posicion;
            while (salir == false) {
                try {
                    System.out.print("Que posicionen quieres? ");
                    posicion = input.nextInt();
                    if (posicion < 0) {
                        salir = true;
                        System.out.println("SAlir del programa");
                    } else {
                        System.out.println("valor en la posiicion" + posicion + "en el vector" + vector[n]);
                    }
                } catch (InputMismatchException exception) {
                    //tiene que ser entero
                    System.out.println("no es un numero entero");
                    input.nextLine();
                } catch (ArrayIndexOutOfBoundsException exception) {
                    //salirte del vector
                    System.out.println("Posicion no existe");
                }
            }
        }
    }
}
