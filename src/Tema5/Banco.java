package Tema5;

import java.util.ArrayList;
import java.util.List;

public class Banco { // ¡Importante! El nombre debe ser Banco
    private List<Cliente> cola;

    public Banco() {
        this.cola = new ArrayList<>();
    }

    // 1. Llegada
    public void llegarCliente(String nombre, int edad, String dni) {
        Cliente nuevo = new Cliente(nombre, edad, dni);
        cola.add(nuevo);
        System.out.println("Cliente añadido.");
    }

    // 2. Atender (quitar el primero)
    public void atenderCliente() {
        if (cola.isEmpty()) {
            System.out.println("No hay nadie.");
        } else {
            Cliente atendido = cola.remove(0); // Quitamos el de la posición 0
            System.out.println("Atendiendo a: " + atendido);
        }
    }

    // 3. Abandonar (Versión SIN NULL y SIN if raro)
    public void abandonarCola(String dni) {
        // Recorremos la lista por posiciones (0, 1, 2...)
        for (int i = 0; i < cola.size(); i++) {
            Cliente c = cola.get(i);

            // Si el DNI coincide...
            if (c.getDni().equals(dni)) {
                cola.remove(i); // ...lo borramos directamente usando su posición (i)
                System.out.println("El cliente se ha ido.");
                return; // ¡IMPORTANTE! El return nos saca del método aquí mismo. Fin.
            }
        }

        // Si el bucle termina y no se ha ejecutado el 'return' de arriba,
        // significa que no hemos encontrado a nadie.
        System.out.println("No se ha encontrado ese DNI.");
    }
}