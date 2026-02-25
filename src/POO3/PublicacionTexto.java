package POO3;

public class PublicacionTexto implements Publicacion{
    private String autor;
    private String mensaje;

    private String BASE_AUTOR="Anonimo";
    private String BASE_MENSAJE="hola";

    public PublicacionTexto(String autor,String mensaje) {
        this.autor = autor;
        this.mensaje=mensaje;
    }
    public PublicacionTexto(){
        this.autor=BASE_AUTOR;
        this.mensaje=BASE_MENSAJE;

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void publicar() {
        System.out.println("ha publicado un mensaje "+this.mensaje);
    }

    public void compartir() {
        System.out.println("ha publiado un texto"+this.autor);

    }

    @Override
    public void reaccion() {
        System.out.println("alguien ha reaccionado a"+this.mensaje);
    }


    @Override
    public String toString() {
        return "PublicacionTexto{" +
                "autor='" + autor + '\'' +
                ", mensaje='" + mensaje + '\'' +
                '}';
    }



    }

