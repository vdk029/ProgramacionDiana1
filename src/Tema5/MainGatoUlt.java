package Tema5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MainGatoUlt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creamos el ArrayList para guardar objetos de tipo Gato
        ArrayList<Gato> listaGatos = new ArrayList<>();

        System.out.println("--- REFUGIO DE GATOS ---");
        System.out.println("Necesitamos registrar 5 gatos válidos.");

        // Bucle para pedir 5 gatos
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("\nIntroduce los datos del gato número " + (i + 1) + ":");

                System.out.print("Nombre: ");
                String nombre = input.nextLine();

                System.out.print("Edad: ");
                int edad = input.nextInt();
                input.nextLine(); // ¡IMPORTANTE! Limpiar el buffer después de leer un número

                // Intentamos crear el gato
                // Si el nombre es corto o la edad negativa, aquí saltará la Exception del constructor
                Gato nuevoGato = new Gato(nombre, edad);

                // Si llegamos aquí, es que el gato es válido. Lo guardamos.
                listaGatos.add(nuevoGato);
                System.out.println(">> Gato guardado correctamente.");

            } catch (InputMismatchException e) {
                // Error si meten letras en la edad
                System.out.println("ERROR: La edad debe ser un número entero.");
                input.nextLine(); // Limpiamos la basura del scanner
                i--; // Repetimos la vuelta

            } catch (Exception e) {
                // Error si el nombre es corto o edad negativa (viene de la clase Gato)
                System.out.println(e.getMessage()); // Imprimimos el mensaje del throw
                i--; // Repetimos la vuelta
            }
        }

        // Al final, mostramos la lista completa
        System.out.println("\n--- LISTA DEFINITIVA DE GATOS ---");
        // Usamos un for-each para recorrer el ArrayList cómodamente
        for (Gato g : listaGatos) {
            g.imprimir();
        }

        input.close();
    }
}
