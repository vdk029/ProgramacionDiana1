package POO3;

public class Libros extends Ficha {
    private String autor;
    private String editorial;

    private String BASE_AUTOR = "sin nombre";
    private String BASE_EDITORIAL = "editorial";

    public Libros(int numero, String titulo, String autor, String editorial) {
        super(numero, titulo);
        this.autor = autor;
        this.editorial = editorial;
    }

    public Libros() {
        super();
        this.autor = BASE_AUTOR;
        this.editorial = BASE_EDITORIAL;
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public void prestar() {
        System.out.println("visto id"+getNumero()+"titulo"+getTitulo() );
        System.out.println("Autor"+this.autor+"Editorial"+this.editorial);

    }

    @Override
    public String toString() {
        return "Libros{" +
                "autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}
