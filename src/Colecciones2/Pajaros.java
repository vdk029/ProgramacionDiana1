package Colecciones2;

import Colecciones2.Avistamiento;

public class Pajaros extends Avistamiento {
    private int peso;
    private String especie;

    public Pajaros(int hora,int peso,String especie) {
        super(hora);
        this.peso=peso;
        this.especie=especie;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Pajaros{" +
                "peso=" + peso +
                ", especie='" + especie + '\'' +
                '}';
    }
}
