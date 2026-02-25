package Colecciones2;

import Colecciones2.Avistamiento;

public class Lobos extends Avistamiento {
    private int numLobos;
    private String observaciones;

    public Lobos(int hora, int numLobos, String observaciones) {
        super(hora);
        this.numLobos = numLobos;
        this.observaciones = observaciones;
    }

    public int getNumLobos() {
        return numLobos;
    }

    public void setNumLobos(int numLobos) {
        this.numLobos = numLobos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Lobos{" +
                "numLobos=" + numLobos +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}
