package POO3;

public class Camion extends Vehiculo {
    private int pesoMax;
    private boolean peligrosa;

    private int BASE_PESOMAX=3650;
    private boolean BASE_PELIGROSA=true;

    public Camion(String marca, String color, String matricula, int anyo,int pesoMax,boolean peligrosa){
        super(marca,color,matricula,anyo);
        this.pesoMax=pesoMax;
        this.peligrosa=peligrosa;

    }
    public Camion(){
        super();
        this.pesoMax=BASE_PESOMAX;
        this.peligrosa=BASE_PELIGROSA;
    }

    public int getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(int pesoMax) {
        this.pesoMax = pesoMax;
    }

    public boolean getPeligrosa() {
        return peligrosa;
    }

    public void setPeligrosa(boolean peligrosa) {
        this.peligrosa = peligrosa;
    }

}

