package Colecciones2;

import java.util.HashMap;
import java.util.Random;

public class Acortador {
    private HashMap<String, String> tabla = new HashMap<>();
    private final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public String crearRegistro(String urlLarga) {
        String clave = "";
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            clave += CARACTERES.charAt(r.nextInt(CARACTERES.length()));
        }
        tabla.put(clave, urlLarga);
        return clave;
    }

    public String resolver(String clave) {
        if (tabla.containsKey(clave)) {
            return tabla.get(clave);
        }
        return "No existe esa clave";
    }

    public void borrar(String clave) {
        tabla.remove(clave);
    }

    public void mostrarTodo() {
        for (String clave : tabla.keySet()) {
            System.out.println("Clave: " + clave + " -> URL: " + tabla.get(clave));
        }
    }
}

