package POO;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaCompra {
    private Set<String> productos;

    //Contructores
    public ListaCompra() {
        this.productos = new HashSet<>();
    }

    public boolean addProducto(String producto) {
        return productos.add(producto);

    }
    public Set<String> getProductos(){
        return productos;
    }
}


