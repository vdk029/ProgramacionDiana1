package POO3;

public class Perro extends Animal {
    private boolean pelo;

    private boolean BASE_PELO = true;

    public Perro(String nombre, String raza, int edad, String color, boolean pelo) {
        super(nombre, raza, edad, color);
        this.pelo = pelo;
    }


    public Perro() {
        super();
        this.pelo = BASE_PELO;
    }


    //metodo
    public boolean tienePelo() {
        System.out.println("el animal" + this.getRaza() + "con nombre" + this.getNombre() + "tiene pelo" + pelo);
        return true;
    }
}
