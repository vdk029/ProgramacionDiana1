package Tema5;

import java.util.HashMap;
import java.util.Map;

public class Gym {
    // La clave (Key) es el DNI (String) y el valor es el objeto Usuario
    private Map<String, Usuario> usuarios;

    public Gym() {
        this.usuarios = new HashMap<>();
    }

    // Método auxiliar para saber si el DNI ya está en la base de datos
    public boolean existe(String dni) {
        return usuarios.containsKey(dni);
    }

    public void darAlta(String dni, String nombre, int edad) {
        Usuario nuevo = new Usuario(nombre, edad);
        usuarios.put(dni, nuevo); // Guardamos en el mapa
    }

    public void darBaja(String dni) {
        usuarios.remove(dni); // Borramos del mapa por la clave
    }

    public void mostrarUsuario(String dni) {
        Usuario u = usuarios.get(dni); // Recuperamos el objeto
        System.out.println("Datos del usuario: " + u.toString());
    }

    public void modificarUsuario(String dni, String nuevoNombre, int nuevaEdad) {
        Usuario u = usuarios.get(dni);
        // Usamos los setters de la clase Usuario para cambiar los datos
        u.setNombre(nuevoNombre);
        u.setEdad(nuevaEdad);
        // Nota: En un mapa, como tenemos la referencia al objeto, al cambiarlo aquí
        // se queda cambiado dentro del mapa automáticamente.
    }
}