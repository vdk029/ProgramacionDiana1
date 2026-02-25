package POO3;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Scanner;

public class MainAnimal {
    public static void main(String[] args) {
        int opciones = 0;
        Scanner input = new Scanner(System.in);
        Perro perro = new Perro("perro", "perro", 12, "marron", true);
        Gato gato = new Gato("gato", "gato", 10, "marro", true);
        Pescado pez = new Pescado("pez", "pescado", 3, "azul", true);
        Aguila pajaro = new Aguila("aguila", "pajaro", 1, "gris", 2);
        Lagarto lagarto = new Lagarto("lagarta", "lagarto", 12, "verde", true);


        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(perro);
        animales.add(gato);
        animales.add(pez);
        animales.add(pajaro);
        animales.add(lagarto);

        //bucle para printear animales
        for (int i = 0; i < animales.size(); i++) {
            Animal animal = animales.get(i);
            System.out.println("aminal nombre " + animal.getNombre());
            System.out.println("animal raza " + animal.getRaza());
            System.out.println("animal edad " + animal.getEdad());
            System.out.println("animal color " + animal.getColor());
            System.out.println("esta comiendo 1 si 2 no");
            opciones=input.nextInt();
            input.nextLine();
            if (opciones == 1) {
                System.out.println(animal.comer("pienso"));
            } else if (opciones == 2) {
                System.out.println("no esta comiendo ");
            } else {
                System.out.println("escribe bien ");
                i--;
            }
            System.out.println("esta dumiendo 1 si 2 no");
            opciones = input.nextInt();
            input.nextLine();
            if (opciones == 1) {
                System.out.println(animal.dormir());
            } else if (opciones == 2) {
                System.out.println("no esta durmiendo" + animal);
            } else {
                System.out.println("escribe bien ");
                i--;
            }
            System.out.println("que ruido hace " + animal);
            String ruido = input.nextLine();
            animal.haceRuido(ruido);

            if (animal instanceof Perro) {
                Perro p = (Perro) animal;
                p.tienePelo();
            } else if (animal instanceof Pescado) {
                Pescado pe = (Pescado) animal;
                pe.tieneEscamas();
            } else if (animal instanceof Aguila) {
                Aguila a = (Aguila) animal;
                a.numAlas();
                int alas = a.numAlas();
                System.out.println("cuantas alas tiene");
                System.out.println(((Aguila) animal).numAlas());
            } else if (animal instanceof Lagarto) {
                Lagarto l = (Lagarto) animal;
                l.cambiarColor("verde");
            }


        }


    }


}
