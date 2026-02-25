package Tema5;

public class Gato {
    private String nombre;
    private int edad;

    // CONSTRUCTOR
    public Gato(String nombre, int edad) {
        this.nombre = nombre;
        this.edad=edad;
    }
    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // SETTERS

    public void setNombre(String nombre) throws Exception {
        //Validar que tenga 3 letras
        if (nombre.length() < 3) {
            throw new Exception("El nombre '" + nombre + "' es muy corto,tiene que tener 3 letras");
        }
        this.nombre = nombre;
    }

    public void setEdad(int edad) throws Exception {
        // Validamos que no sea negativa
        if (edad < 0) {
            throw new Exception("La edad no puede ser negativa (" + edad + ").");
        }
        this.edad = edad;
    }

    public void imprimir() {
        System.out.println(" Soy " + nombre + " y tengo " + edad + " años");
    }
}