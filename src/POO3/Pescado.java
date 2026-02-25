package POO3;

public class Pescado extends Animal{
    private boolean escamas;

    private boolean BASE_ESCAMAS=true;

    public Pescado(String nombre, String raza, int edad, String color, boolean escamas) {
        super(nombre, raza, edad, color);
        this.escamas = escamas;
    }
    public Pescado(){
        super();
        this.escamas=BASE_ESCAMAS;
    }
    //metodo
    public boolean tieneEscamas(){
        System.out.println( "este animal"+this.getRaza()+"con nommbre"+this.getNombre()+"tiene escamas?"+escamas);
        return true;
    }
}
