package Tema5;

import java.util.Scanner;

public class MainBanco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Banco banco = new Banco();
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n--- BANCO ---");
            System.out.println("1. Llegada cliente");
            System.out.println("2. Atender al siguiente");
            System.out.println("3. Cliente abandona cola");
            System.out.println("0. Salir");
            System.out.print("Elige opción: ");

            opcion = input.nextInt();
            input.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = input.nextLine();
                    System.out.print("Edad: ");
                    int edad = input.nextInt();
                    input.nextLine();
                    System.out.print("DNI: ");
                    String dni = input.nextLine();

                    banco.llegarCliente(nombre, edad, dni);
                    break;

                case 2:
                    banco.atenderCliente();
                    break;

                case 3:
                    System.out.print("DNI del que se va: ");
                    String dniCansa = input.nextLine();
                    banco.abandonarCola(dniCansa);
                    break;

                case 0:
                    System.out.println("Adiós.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}