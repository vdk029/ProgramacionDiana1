package POO;

import java.util.Scanner;

public class MainCuenta {
    private static void Mostrarmenu() {
        System.out.println("1 Crear Persona");
        System.out.println("2 Nueva Cuenta");
        System.out.println("3 Ver Datos");
        System.out.println("7 Morosos");
        System.out.println("0 Salir");
        System.out.print("Elige: ");
    }

    public static void main(String[] args) {
        CuentaPersonas[] listaPersonas = new CuentaPersonas[10];
        int contadorPersonas = 0;
        Scanner input = new Scanner(System.in);
        int opcion = 0;

        do {
            Mostrarmenu();
            opcion = input.nextInt();
            input.nextLine();

            if (opcion == 1) {
                System.out.print("Dime el DNI: ");
                String dniNuevo = input.nextLine();
                listaPersonas[contadorPersonas] = new CuentaPersonas(dniNuevo);
                contadorPersonas++;
                System.out.println("Nueva persona creada.");

            } else if (opcion == 2) {
                System.out.print("DNI de la persona: ");
                String dniBuscado = input.nextLine();

                // BUSQUEDA CORRECTA
                int posicionEncontrada = -1;
                for (int i = 0; i < contadorPersonas; i++) {
                    if (listaPersonas[i].getDni().equals(dniBuscado)) {
                        posicionEncontrada = i;
                        break; // Si lo encuentras, deja de buscar
                    }
                }

                if (posicionEncontrada != -1) {
                    System.out.print("ID de la cuenta: ");
                    int numCuenta = input.nextInt();
                    System.out.print("Saldo inicial: ");
                    double saldo = input.nextDouble();

                    Cuenta nuevaCuenta = new Cuenta(numCuenta, saldo);
                    listaPersonas[posicionEncontrada].addCuenta(nuevaCuenta);
                    System.out.println("Cuenta añadida a " + dniBuscado);
                } else {
                    System.out.println("Error: Esa persona no existe.");
                }

            } else if (opcion == 3) {
                System.out.print("DNI a buscar: ");
                String dniBuscado = input.nextLine();

                boolean encontrado = false;
                for (int i = 0; i < contadorPersonas; i++) {
                    if (listaPersonas[i].getDni().equals(dniBuscado)) {
                        System.out.println("Datos: " + listaPersonas[i].toString());
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) System.out.println("Persona no encontrada.");

            } else if (opcion == 7) {
                System.out.println("Listado de morosos:");
                for (int i = 0; i < contadorPersonas; i++) {
                    if (listaPersonas[i].esMorosa()) {
                        System.out.println("- " + listaPersonas[i].getDni());
                    }
                }
            }
        } while (opcion != 0); // Faltaba el cierre del bucle

        System.out.println("Programa finalizado.");
    }
}