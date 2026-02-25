package POO3;

public class Gato extends Animal{
    private boolean pelo;

    private boolean BASE_PELO = true;

    public Gato(String nombre, String raza, int edad, String color, boolean pelo) {
        super(nombre, raza, edad, color);
        this.pelo = pelo;
    }

    //metodo
    public boolean tienePelo() {
        System.out.println("el animal" + this.getRaza() + "con nombre" + this.getNombre() + "tiene pelo" + pelo);
        return true;
    }
}


