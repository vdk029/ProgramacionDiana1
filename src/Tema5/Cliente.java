package Tema5;

public class Cliente {
    private String nombre;
    private int edad;
    private String dni;

    private static final String  NOMBRE_BASE="pepe";
    private static int FINAL_EDAD=18;
    private static String BASE_DNI="26600831C";

    public Cliente(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    public Cliente(){
        this.nombre=NOMBRE_BASE;
        this.edad=FINAL_EDAD;
        this.dni=BASE_DNI;

    }


    public String getDni() {
        return this.dni;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return nombre + " (DNI: " + dni + ")";
    }
}
