package Tema5;

import java.util.Scanner;
import java.util.HashMap;

public class MainGym {
    public static void main(String[] args) {
        Gym miGimnasio = new Gym();
        Scanner input = new Scanner(System.in);

        // Menú
        System.out.println("GIMNASIO");
        System.out.println("1 Dar de alta");
        System.out.println("2 Dar de baja");
        System.out.println("3 Mostrar usuario");
        System.out.println("4 Modificar usuario");
        System.out.print("Elige opcion: ");

        int opcion = input.nextInt();
        input.nextLine();

        String dni;
        String nombre;
        int edad;

        switch (opcion) {
            // alta usauuro
            case 1:
                System.out.println("DNI");
                dni = input.nextLine();
                System.out.println("Nombre");
                nombre = input.nextLine();
                System.out.println("Edad");
                edad = input.nextInt();

                miGimnasio.darAlta(dni, nombre, edad);
                System.out.println("Usurio guardado");
                break;
            //baja usuario
            case 2:
                System.out.println("DNI a borrar:");
                dni = input.nextLine();
                miGimnasio.darBaja(dni);
                System.out.println("Usuario eliminado");
                break;

            case 3:
                System.out.println("DNI a buscar:");
                dni = input.nextLine();
                miGimnasio.mostrarUsuario(dni);
                break;

            case 4: // MODIFICAR
                System.out.println("DNI a modificar:");
                dni = input.nextLine();
                System.out.println("Nuevo Nombre:");
                nombre = input.nextLine();
                System.out.println("Nueva Edad:");
                edad = input.nextInt();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}