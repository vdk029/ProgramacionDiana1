package POO3;

public class DVD extends Ficha{
    public enum TipoDVD{
        ANIMACION, ACCION, DOCUMENTAL, CIENCIA_FICCION
    }

    private String director;
    private int anyo;
    private TipoDVD tipo;

    private String BASE_DIRECTOR="anonimo";
    private int BASE_ANYO=2000;
    private TipoDVD TIPO_BASE=TipoDVD.DOCUMENTAL;

    public DVD(int numero, String titulo, String director, int anyo, TipoDVD tipo) {
        super(numero, titulo);
        this.director = director;
        this.anyo = anyo;
        this.tipo = tipo;
    }
    public DVD(){
        super();
        this.director=BASE_DIRECTOR;
        this.anyo=BASE_ANYO;
        this.tipo=TIPO_BASE;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public TipoDVD getTipo() {
        return tipo;
    }

    public void setTipo(TipoDVD tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "director='" + director + '\'' +
                ", anyo=" + anyo +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public void prestar() {
        System.out.println("visto id"+getNumero()+"titulo"+getTitulo() );
        System.out.println("Director"+this.director+"anyo"+this.anyo+"dime que genero es "+this.tipo);
        switch (this.tipo){
            case ACCION -> System.out.println("duracion 90 min");
            case ANIMACION -> System.out.println("duracion 80 min ");
            case DOCUMENTAL -> System.out.println("Duraion 100 min");
            case CIENCIA_FICCION -> System.out.println("DUracion 130 min");
        }

    }
}
