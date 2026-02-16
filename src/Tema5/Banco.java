package Tema5;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> cola;

    public Banco() {
        this.cola = new ArrayList<>();
    }

    public void llegarCliente(String nombre, int edad, String dni) {
        Cliente nuevo = new Cliente(nombre, edad, dni);
        cola.add(nuevo);
        System.out.println("Cliente añadido.");
    }

    public void atenderCliente() {
        if (cola.isEmpty()) {
            System.out.println("No hay nadie.");
        } else {
            Cliente atendido = cola.remove(0);
            System.out.println("Atendiendo a: " + atendido);
        }
    }

    public void abandonarCola(String dni) {
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