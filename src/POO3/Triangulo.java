package POO3;

public class Triangulo extends Figura2D{
    private double base;
    private double altura;

    private double BASE_BASE=3.00;
    private double BASE_ALTURA=4.00;

    public Triangulo(String tipo, double base, double altura) {
        super(tipo);
        this.base = base;
        this.altura = altura;
    }
    public Triangulo(){
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
        return base*altura/2;
    }

    @Override
    public double perimetro() {

        return base+altura+altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
