package Tema3M1;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("MENU:");
            System.out.println("1. Signo de un numero");
            System.out.println("2. Mayor de edad");
            System.out.println("3. Area y perimetro de un circulo");
            System.out.println("4. Conversor euros/dolares");
            System.out.println("5. Tabla de multiplicar ");
            System.out.println("6. Tablas de multiplicar del 1 al 10");
            System.out.println("7. Numeros primos");
            System.out.println("8. Fechas");
            System.out.println("9. Triangulo arbol");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    //pedir por teclado un número y pasárselo por parámetro a la función
                    int num = Scanner
                    Ejercicio1.numberSign(num);
                    break;
                case 2:
                    isAdult();
                    break;
                case 3:
                    calcRadio();
                    break;
                case 4:
                    showMenu();
                    break;
                case 5:
                    tableMult();
                    break;
                case 6:
                    allTables();
                    break;
                case 7:
                    positivos();
                    break;
                case 8:
                    fechas();
                    break;
                case 9:
                    triangulo();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 0);

        input.close();
    }

}

