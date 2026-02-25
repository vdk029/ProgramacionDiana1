package POO3;

public class Rectangulo extends Figura2D{
    private double base;
    private double altura;

    private double BASE_BASE=3.00;
    private double BASE_ALTURA=3.00;

    public Rectangulo(String tipo, double base, double altura) {
        super(tipo);
        this.base = base;
        this.altura = altura;
    }
    public Rectangulo(){
        super();
        this.base=BASE_BASE;
        this.altura=BASE_ALTURA;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return base*altura;
    }

    @Override
    public double perimetro() {
        return 2*(base+altura);
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
