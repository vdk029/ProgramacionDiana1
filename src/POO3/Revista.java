package POO3;

public class Revista extends Ficha{
    private int numPublicacion;
    private int anyo;

    private int BASE_NUMPUBLIACION=12;
    private int BASE_ANYO=2000;

    public Revista(int numero, String titulo, int numPublicacion, int anyo) {
        super(numero, titulo);
        this.numPublicacion = numPublicacion;
        this.anyo = anyo;
    }
    public Revista(){
        super();
        this.numPublicacion=BASE_NUMPUBLIACION;
        this.anyo=BASE_ANYO;
    }

    public int getNumPublicacion() {
        return numPublicacion;
    }

    public void setNumPublicacion(int numPublicacion) {
        this.numPublicacion = numPublicacion;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    @Override
    public void prestar() {
        System.out.println("visto id"+getNumero()+"titulo"+getTitulo() );
        System.out.println("numeroPublicacion"+this.numPublicacion+"anyo"+this.anyo);

    }
}
