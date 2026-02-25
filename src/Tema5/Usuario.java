package Tema5;


import java.util.List;

public class Usuario {
    private String nombre;
    private int edad;

    private final String NOMBRE_BASE="pepe";
    private final int EDAD_BASE=20;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public Usuario(){
        this.nombre=NOMBRE_BASE;
        this.edad=EDAD_BASE;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}