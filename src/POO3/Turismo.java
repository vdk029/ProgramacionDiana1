package POO3;

//turismo hereda de Vehiculo
public class Turismo extends Vehiculo {

    //atributos de clase turismo
    private int numPlazas;
    private String tipoUso;

    private int BASE_NUMPLAZAS = 5;
    private String BASE_TIPOUSO = "particular";

    public Turismo(String marca, String color, String matricula, int anyo, int numPlazas, String tipoUso) {
        //le pasamos la info de constructor de padre vehiculo con SUPER
        super(marca, color, matricula, anyo);
        this.numPlazas = numPlazas;
        this.tipoUso = tipoUso;
    }

    public Turismo() {
        super();
        this.numPlazas = BASE_NUMPLAZAS;
        this.tipoUso = BASE_TIPOUSO;

    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public String getTipoUso() {
        return tipoUso;
    }

    public void setTipoUso(String tipoUso) {
        this.tipoUso = tipoUso;
    }

    @Override
    public String toString() {
        return "Turismo{" +
                "numPlazas=" + numPlazas +
                ", tipoUso='" + tipoUso;

    }
}
