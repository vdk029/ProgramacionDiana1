package POO;

import java.util.Scanner;

public class MainCuenta {
    public static void main(String[] args) {
        CuentaPersonas[] listaPersonas = new CuentaPersonas[10];
        int contadorPersonas = 0;
        Scanner input = new Scanner(System.in);
        int opcion = -1;


        while (opcion != 0) {
            System.out.println("1. Crear Persona " +
                    " 2. Nueva Cuenta " +
                    " 3. Ver Datos " +
                    " 7. Morosos " +
                    "0. Salir");
            System.out.print("Elige: ");
            opcion = input.nextInt();
            input.nextLine();

            if (opcion == 1) {
                // CREAR PERSONA
                System.out.print("Dime el DNI: ");
                String dniNuevo = input.nextLine();
                CuentaPersonas p = new CuentaPersonas(dniNuevo);
                listaPersonas[contadorPersonas] = p;
                contadorPersonas++;
                System.out.println("Nueva persona creada");

            } else if (opcion == 2) {
                // AÑADIR CUENTA
                System.out.print("DNI de la persona: ");
                String dniBuscado = input.nextLine();

                // Buscamos a la persona en el array (un for de toda la vida)
                int posicionEncontrada = 0;
                for (int i = 0; i < contadorPersonas; i++) {
                    if (listaPersonas[i].getDni().equals(dniBuscado)) {
                        posicionEncontrada = i;
                    }
                }


                //MIRAR SI ID cuenta
                if (posicionEncontrada != -1) {
                    System.out.print("Dime el id de la cuenta");
                    int numCuenta = input.nextInt();
                    System.out.print("Saldo inicial: ");
                    double saldo = input.nextDouble();

                    Cuenta nuevaCuenta = new Cuenta(numCuenta, saldo);
                    listaPersonas[posicionEncontrada].addCuenta(nuevaCuenta);
                    System.out.println("Cuenta añadida a " + dniBuscado);
                } else {
                    System.out.println("Esa persona no existe.");
                }

            } else if (opcion == 3) {
                // MOSTRAR DATOS
                System.out.print("DNI a buscar: ");
                String dniBuscado = input.nextLine();

                int posicionEncontradaArray = 0;

                for (int i = 0; i < contadorPersonas; i++) {
                    if (listaPersonas[i].getDni().equals(dniBuscado)) {
                        posicionEncontradaArray = i;
                        System.out.println("Cuenta encontrada");
                    } else {
                        System.out.println("cuenta no encontrada");
                    }
                }

            } else if (opcion == 7) {
                // LISTAR MOROSOS
                System.out.println("Buscando gente sin blanca...");
                for (int i = 0; i < contadorPersonas; i++) {
                    if (listaPersonas[i].esMorosa()) {
                        System.out.println("Es moroso " + listaPersonas[i].getDni());
                    }
                }
            }
        }

    }
}

