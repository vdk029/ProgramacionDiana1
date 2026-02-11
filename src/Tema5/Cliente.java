package Tema5;

public class Cliente {
    private String nombre;
    private int edad;
    private String dni;

    public Cliente(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return nombre + " (DNI: " + dni + ")";
    }
}
