package POO;

import java.util.Scanner;

public class MainGym {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Gym gym = new Gym();
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("1. Alta " +
                    " 2 Baja " +
                    " 3 Mostrar " +
                    " 4 Modificar " +
                    " 0 Salir");
            opcion = input.nextInt();
            switch (opcion) {
                case 1 -> { // Abrimos llave para el caso 1
                    System.out.print("DNI para alta: ");
                    String dni = input.nextLine(); // Este DNI nace y muere aquí dentro
                    if (gym.existe(dni)) {
                        System.out.println("Ya existe");
                    } else {
                        // ... resto del código del alta ...
                    }
                } // Cerramos llave del caso 1. El DNI del caso 1 desaparece aquí.

                case 4 -> { // Abrimos llave para el caso 4
                    System.out.print("DNI para modificar: ");
                    String dni = input.nextLine(); // ¡Ahora ya no sale en rojo! Es una variable "nueva"
                    if (gym.existe(dni)) {
                        // ... lógica de modificar ...
                    } else {
                        System.out.println("No existe ese DNI");
                    }
                } // Cerramos llave del caso 4
            }
        }
    }
}


