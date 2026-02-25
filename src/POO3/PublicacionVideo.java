package POO3;

public class PublicacionVideo implements Publicacion,AbrirPublicacion{
    private String autor;
    private String video;

    private String BASEE_AUTOR = "autor";
    private String BASE_VIDEO= "video";

    public PublicacionVideo(String autor, String imagenes) {
        this.autor = autor;
        this.video = video;
    }

    public PublicacionVideo() {
        this.autor = BASEE_AUTOR;
        this.video = BASE_VIDEO;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    @Override
    public void abrir() {
        System.out.println("ver publicacion"+this.video);
    }

    @Override
    public void publicar() {

        System.out.println("autor "+this.autor+"ha publicado"+this.video);
    }

    @Override
    public void compartir() {
        System.out.println("unos videos se han compartido"+this.video);

    }
    @Override
    public void reaccion() {
        System.out.println("alguien ha reaccionado a"+this.video);
    }

    @Override
    public String toString() {
        return "PublicacionVideo{" +
                "autor='" + autor + '\'' +
                ", video='" + video + '\'' +
                '}';
    }
}
