package POO3;

public class Animal {
    private String nombre;
    private String raza;
    private int edad;
    private String color;

    private String BASE_NOMBRE;
    private String BASE_RAZA;
    private int BASE_EDAD;
    private String BASE_COLOR;

    public Animal(String nombre, String raza, int edad, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
    }

    public Animal() {
        this.nombre = BASE_NOMBRE;
        this.raza = BASE_RAZA;
        this.edad = BASE_EDAD;
        this.color = BASE_COLOR;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Metodos
    public boolean comer(String comida) {
        System.out.println(this.raza + "llamado" + this.nombre + "se esta comiendo su comida" + comida);
        return true;
    }

    public boolean dormir() {
        System.out.println(this.nombre + "esta dumierdo");
        return true;
    }

    //le meto parametro porque vamos a interactuar en el main enciando el ruido que hara
    public void haceRuido(String ruido) {
        System.out.println(this.raza + "llamado" + this.nombre + "esta haciendo" + ruido);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                '}';
    }
}

