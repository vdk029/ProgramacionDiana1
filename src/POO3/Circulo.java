package POO3;

public class Circulo extends Figura2D {
    private final double pi;
    private double radio;
    private double diametro;

    private double BASE_PI = 3.14;
    private double BASE_RADIO = 3.00;


    public Circulo(String tipo,double pi,double radio) {
        super(tipo);
        this.pi = pi;
        this.radio = radio;

    }

    public Circulo() {
        super();
        this.pi = 3.14;
        this.radio = radio;

    }


    public double getPi() {
        return pi;
    }



    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    @Override
    public double area() {
        return pi * (radio * 2);
    }

    @Override
    public double perimetro() {
        return 2 * (radio * pi);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "pi=" + pi +
                ", radio=" + radio +
                '}';
    }
}
