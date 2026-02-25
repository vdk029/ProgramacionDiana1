package Tema5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainBanco {

    //Hacer metodo del menu:
    public static void mostrarMenu() {
        //el menú metelo en un procedimiento
        System.out.println("BANCO");
        System.out.println("1 Llegada cliente");
        System.out.println("2 Atender al siguiente");
        System.out.println("3 Cliente abandona cola");
        System.out.println("0 Salir");
        System.out.print("Elige opcion: ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         List<Cliente> cola =new ArrayList<>();;
        int opcion;
        String nombre;
        int edad;
        String dni="26600831C";


        do {
            mostrarMenu();


            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    nombre = input.nextLine();
                    System.out.print("Edad: ");
                    edad = input.nextInt();
                    input.nextLine();
                    System.out.print("DNI: ");
                    dni = input.nextLine();

                    llegarCliente(nombre, edad, dni, cola);
                    break;

                case 2:
                    atenderCliente(cola);
                    break;

                case 3:
                    System.out.print("DNI del que se va: ");
                    String dniCansa = input.nextLine();
                    //SUPER IMPORTANTE MIRAR ESTO PORQUE DECLARAR VARIABLE??
                    abandonarCola("26600831C",cola);

                    break;

                case 0:
                    System.out.println("Adios.");
                    break;

                default:
                    System.out.println("Error");
            }
        } while (opcion != 0);
    }

    public static void llegarCliente(String nombre, int edad, String dni, List<Cliente> cola) {
        Cliente nuevo = new Cliente(nombre, edad, dni);
        cola.add(nuevo);
        System.out.println("Cliente añadido.");
    }

    public static void atenderCliente( List<Cliente> cola) {
        if (cola.isEmpty()) {
            System.out.println("No hay nadie.");
        } else {
            Cliente atendido = cola.remove(0);
            System.out.println("Atendiendo " + atendido);
        }
    }

    public static void abandonarCola(String dni, List<Cliente> cola) {
        boolean encontrado = false;
        int i = 0;

        while (i < cola.size() || encontrado == false) {
            Cliente c = cola.get(i);

            if (c.getDni().equals(dni)) {
                cola.remove(i);
                encontrado = true;
                System.out.println("sE HA IDO el cleinte.");
            } else {
                System.out.println("No se ha ido ");
            }
        }
        if (encontrado == false) {
            System.out.println("No se ha encontrado ese DNI.");
        }
    }

}