package Tema5;

import java.util.Scanner;
import java.util.HashMap;


public class MainGym {


    public static void menu() {

        System.out.println("1 Dar de alta");
        System.out.println("2 Dar de baja");
        System.out.println("3 Mostrar usuario");
        System.out.println("4 Modificar usuario");
        System.out.print("Elige opcion: ");
    }

    public static void main(String[] args) {
        Gym miGimnasio = new Gym();
        int opcion;
        Scanner input = new Scanner(System.in);
        do {
            menu();
            opcion = input.nextInt();
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
                    System.out.println("buscar usuario pon su dni");
                    dni = input.nextLine();
                    miGimnasio.mostrarUsuario(dni);
                    break;

                case 4:
                    System.out.println("DNI a modificar:");
                    dni = input.nextLine();
                    System.out.println("Nuevo Nombre:");
                    nombre = input.nextLine();
                    System.out.println("Nueva Edad:");
                    edad = input.nextInt();
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opción no valida.");
            }
        }while (opcion != 5) ;

        }
    }




