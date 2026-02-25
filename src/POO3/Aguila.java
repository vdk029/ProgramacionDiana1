package POO3;

public class Aguila extends Animal {
    private int alas;

    private int BASE_ALAS = 2;

    public Aguila(String nombre, String raza, int edad, String color, int alas) {
        super(nombre, raza, edad, color);
        this.alas = alas;
    }

    public Aguila() {
        super();
        this.alas = BASE_ALAS;
    }

    //metodo las alas siempre son 2 asi que por defecto mandamos 2
    public int numAlas() {
        this.alas = BASE_ALAS;
        return alas;
    }
}
