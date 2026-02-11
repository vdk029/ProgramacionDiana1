package Tema5;

import java.util.Scanner;

public class MainGym {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Gym gym = new Gym();
        int opcion = -1;

        while (opcion != 0) {
            System.out.println(" gym");
            System.out.println("1. Alta | 2. Baja | 3. Mostrar | 4. Modificar | 0. Salir");
            System.out.print("Elige opcion: ");

            opcion = input.nextInt();
            input.nextLine(); // Limpiar el buffer

            // Declaramos la variable aquí para poder usarla en todos los cases sin repetir 'String'
            String dni;

            switch (opcion) {
                case 1:
                    System.out.print("DNI para alta: ");
                    dni = input.nextLine(); // Ya no ponemos 'String dni', solo 'dni'
                    if (gym.existe(dni)) {
                        System.out.println("Ese DNI ya existe.");
                    } else {
                        System.out.print("Nombre: ");
                        String nombre = input.nextLine();
                        System.out.print("Edad: ");
                        int edad = input.nextInt();
                        input.nextLine(); // Limpiar buffer tras la edad
                        gym.darAlta(dni, nombre, edad);
                    }
                    break;

                case 2:
                    System.out.print("DNI a eliminar: ");
                    dni = input.nextLine();
                    if (gym.existe(dni)) {
                        gym.darBaja(dni);
                    } else {
                        System.out.println("No existe.");
                    }
                    break;

                case 3:
                    System.out.print("DNI a buscar: ");
                    dni = input.nextLine();
                    if (gym.existe(dni)) {
                        gym.mostrarUsuario(dni);
                    } else {
                        System.out.println("No existe.");
                    }
                    break;

                case 4:
                    System.out.print("DNI a modificar: ");
                    dni = input.nextLine();
                    if (gym.existe(dni)) {
                        System.out.print("Nuevo nombre: ");
                        String nuevoNombre = input.nextLine();
                        System.out.print("Nueva edad: ");
                        int nuevaEdad = input.nextInt();
                        input.nextLine(); // Limpiar buffer tras la edad

                        gym.modificarUsuario(dni, nuevoNombre, nuevaEdad);
                    } else {
                        System.out.println("No existe.");
                    }
                    break;

                case 0:
                    System.out.println("Adiós.");
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}