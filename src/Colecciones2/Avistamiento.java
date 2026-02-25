package Colecciones2;

public abstract class Avistamiento {
    protected int hora;
    protected int BASE_HORA=1;

    public Avistamiento(int hora) {
        this.hora = hora;
    }
    public Avistamiento(){
        this.hora=BASE_HORA;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Avistamiento{" +
                "hora=" + hora +
                '}';
    }
}
