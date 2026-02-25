package POO3;

public class Lagarto extends Animal {
    private boolean esVenenoso;

    //usamos color base de padre Animal como por defecto en base cambiar color
    private boolean BASE_VENENOSO = true;

    public Lagarto(String nombre, String raza, int edad, String color, boolean esVenenoso) {
        super(nombre, raza, edad, color);
        this.esVenenoso = esVenenoso;
    }

    public Lagarto() {
        super();
        this.esVenenoso = BASE_VENENOSO;
    }
    //metodo cambiar color

    public void cambiarColor(String nuevoColor) {
        this.setColor(nuevoColor);
        System.out.println(this.getNombre() + "ha cambiado el color " + nuevoColor);
    }
}
