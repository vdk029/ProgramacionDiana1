package Tema5;

import java.util.HashSet;
import java.util.Set;

public class ListaCompra {
    private Set<String> productos;
    private Set<String> carroCompra;

    public ListaCompra() {
        this.productos = new HashSet<>();
        this.carroCompra = new HashSet<>();
    }

    public boolean addProducto(String producto) {
        return productos.add(producto);
    }

    public boolean meterEnCarro(String producto) {
        if (productos.contains(producto)) {
            return carroCompra.add(producto);
        }
        return false;
    }

    public void mostrarListaDeseos() {
        System.out.println("Cosas por comprar:");
        for (String p : productos) {
            System.out.println("- " + p);
        }
    }

    public void mostrarCarro() {
        System.out.println("En el carro:");
        for (String p : carroCompra) {
            System.out.println("" + p);
        }
    }

    public void falta() {
        System.out.println("falta por meter dentro ");
        Set<String> falta = new HashSet<>(productos);
        falta.removeAll(carroCompra);

        if (falta.isEmpty()) {
            System.out.println("Ya lo tiened ");
        } else {
            for (String p : falta) {
                System.out.println("" + p);
            }
        }
    }
    public Set<String> getProductos() {
        return productos;
    }
}


