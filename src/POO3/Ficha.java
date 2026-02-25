package POO3;

public abstract class Ficha {
    private final int numero;
    private String titulo;

    private final int BASE_NUMERO = 2;
    private String BASE_TITULO = "generico";

    public Ficha(int numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
    }

    public Ficha() {
        this.numero = BASE_NUMERO;
        this.titulo = BASE_TITULO;

    }

    public int getNumero() {
        return numero;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //metodo creacion de un metodo que nos diga si hemos leido libro,visto peli o leido revista
   public abstract void prestar();
    @Override
    public String toString() {
        return "Ficha{" +
                "numero=" + numero +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
