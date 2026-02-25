package POO3;

public class Ciclomotor extends Vehiculo {
    private int cilindrada;
    private int BASE_CILINDRADA = 125;

    public Ciclomotor(String marca, String color, String matricula, int anyo, int cilindrada) {
        super(marca, color, matricula, anyo);
        setCilindrada(cilindrada);
    }

    public Ciclomotor() {
        super();
        this.cilindrada = BASE_CILINDRADA;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        if (cilindrada < 50) {
            this.cilindrada = BASE_CILINDRADA;
        } else {
            this.cilindrada = cilindrada;
        }
    }


    //no parametros porque usamos parametros porque los atributos ponemos this.
    public boolean necesitaCarnet() {
        if (this.cilindrada >=125) {
            System.out.println("necesita carnet");
            return true;
        } else {
            System.out.println("no necesita carnet");
            return false;
        }
    }
}
