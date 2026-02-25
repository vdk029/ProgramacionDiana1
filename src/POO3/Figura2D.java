package POO3;

public abstract class Figura2D {
 private String tipo;

 private String BASE_TIPO="triangulo";

 //Constructores

    public Figura2D(String tipo) {
        this.tipo = tipo;
    }
    public Figura2D(){
        this.tipo=BASE_TIPO;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Nada de info en los metodos porque no tenemos nad en clase abstracta
    public abstract double area();
    public abstract double perimetro();
    @Override
    public String toString() {
        return "Figura2D{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
