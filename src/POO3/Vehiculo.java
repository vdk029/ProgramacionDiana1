package POO3;

public class Vehiculo {
    private String marca;
    private String color;
    private String matricula;
    private int anyo;


    private String BASE_MARCA = "Ford";
    private String BASE_COLOR = "Rojo";
    //sera final y ademas string porque a pesar de tener numeros tiene letras
    private final String BASE_MATRICULA = "1257HVW";
    private int BASE_ANYO = 2020;

    //COnstructor
    public Vehiculo(String marca, String color, String matricula, int anyo) {
        this.marca = marca;
        this.color = color;
        this.matricula = matricula;
        this.anyo = anyo;
    }
    //Contructor vacio
        public Vehiculo(){

            this.marca = BASE_MARCA;
            this.color = BASE_COLOR;
            this.matricula = BASE_MATRICULA;
            this.anyo = BASE_ANYO;
        }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", matricula='" + matricula + '\'' +
                ", anyo=" + anyo;

    }
}

