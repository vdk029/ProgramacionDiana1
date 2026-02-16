package Tema5;

public class Gato {
    private String nombre;
    private int edad;

    // CONSTRUCTOR
    // Avisamos que puede fallar (throws Exception) porque llama a los setters
    public Gato(String nombre, int edad) throws Exception {
        this.setNombre(nombre); // Usamos el setter para validar
        this.setEdad(edad);     // Usamos el setter para validar
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // SETTERS (Aquí está la lógica de validación)

    public void setNombre(String nombre) throws Exception {
        // Validamos que tenga al menos 3 letras
        if (nombre.length() < 3) {
            throw new Exception("ERROR: El nombre '" + nombre + "' es muy corto. Mínimo 3 letras.");
        }
        this.nombre = nombre;
    }

    public void setEdad(int edad) throws Exception {
        // Validamos que no sea negativa
        if (edad < 0) {
            throw new Exception("ERROR: La edad no puede ser negativa (" + edad + ").");
        }
        this.edad = edad;
    }

    // MÉTODO IMPRIMIR
    public void imprimir() {
        System.out.println("Miau! Soy " + nombre + " y tengo " + edad + " años.");
    }
}