package POO3;

import java.util.ArrayList;

public class MainPublicaciones {
    public static void main (String[]args) {
        PublicacionTexto texto = new PublicacionTexto();
        PublicacionFoto foto = new PublicacionFoto();
        PublicacionVideo video = new PublicacionVideo();
        ArrayList<Publicacion> publicaciones = new ArrayList<>();
        publicaciones.add(texto);
        publicaciones.add(foto);
        publicaciones.add(video);

        for (int i = 0; i < publicaciones.size(); i++) {
            System.out.println("publicaciones");
            publicaciones.get(i).publicar();
            publicaciones.get(i).compartir();
            publicaciones.get(i).reaccion();
            if(publicaciones.get(i) instanceof AbrirPublicacion){
                ((AbrirPublicacion)publicaciones.get(i)).abrir();
            }

        }
    }
}
