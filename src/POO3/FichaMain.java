package POO3;

import java.util.ArrayList;
import java.util.Scanner;


public class FichaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int diasPrestados;
        Libros libro = new Libros(1, "titulo libro", "autor", "editotial");
        Revista revista = new Revista(2, "revista", 3, 2000);
        DVD dvd = new DVD(3, "pelicula generica", "director", 2000, DVD.TipoDVD.ANIMACION);

        ArrayList<Ficha> ficha = new ArrayList<>();
        ficha.add(libro);
        ficha.add(revista);
        ficha.add(dvd);
        for (int i = 0; i < ficha.size(); i++) {
            Ficha fichas = ficha.get(i);
            System.out.println("ID de lo que vas a tomar prestado" + fichas.getNumero());
            System.out.println(" titulo de" + fichas.getTitulo());
            System.out.println("Cuantos dias lo tomas prestado");
            diasPrestados = input.nextInt();
            input.nextLine();
            System.out.println(fichas.toString() + "dias prestados" + diasPrestados);

            if (fichas instanceof DVD) {
                System.out.println("-> Nota: Dirigida por " + ((DVD) fichas).getDirector());


            }
        }

    }
}