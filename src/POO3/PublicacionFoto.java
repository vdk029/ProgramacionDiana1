package POO3;

public class PublicacionFoto implements Publicacion, AbrirPublicacion {
    private String autor;
    private String imagenes;

    private String BASEE_AUTOR = "autor";
    private String BASE_IMAGEN = "imagen1";

    public PublicacionFoto(String autor, String imagenes) {
        this.autor = autor;
        this.imagenes = imagenes;
    }

    public PublicacionFoto() {
        this.autor = BASEE_AUTOR;
        this.imagenes = BASE_IMAGEN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getImagenes() {
        return imagenes;
    }

    public void setImagenes(String imagenes) {
        this.imagenes = imagenes;
    }

    @Override
    public void publicar() {
        System.out.println("autor " + this.autor + "ha subido una publicacion");

    }

    @Override
    public void compartir() {
        System.out.println("una foto " + this.imagenes + "se han compartido ");

    }

    @Override
    public void abrir() {
        System.out.println("Abriendo imagenes para ver" + this.imagenes);
    }
    @Override
    public void reaccion() {
        System.out.println("alguien ha reaccionado a"+this.imagenes);
    }

    @Override
    public String toString() {
        return "PublicacionFoto{" +
                "autor='" + autor + '\'' +
                ", imagenes='" + imagenes + '\'' +
                '}';
    }
}
