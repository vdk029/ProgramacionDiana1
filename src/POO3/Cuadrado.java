package POO3;

public class Cuadrado extends Figura2D{
    private double lado;

    private double BASE_LADO=3.00;

    public Cuadrado(String tipo,double lado) {
        super(tipo);
        this.lado=lado;
    }
    private Cuadrado(){
        super();
        this.lado=BASE_LADO;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4* lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                '}';
    }
}
