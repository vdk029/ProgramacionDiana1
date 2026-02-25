package Colecciones2;

import java.util.ArrayList;
import java.util.Scanner;

public class MainAvistamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Avistamiento> parque = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n1. Añadir Serpiente\n2. Añadir Pájaro\n3. Añadir Lobos\n4. Ver +8h\n5. Ver Nocturnos\n6. Ver Lobos\n7. Ver Serpientes\n8. Ver Pájaros\n9. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Hora, longitud y especie:");
                    parque.add(new Serpiente(sc.nextInt(), sc.nextDouble(), sc.next()));
                }
                case 2 -> {
                    System.out.println("Hora, peso y especie:");
                    parque.add(new Pajaros(sc.nextInt(), sc.nextInt(), sc.next()));
                }
                case 3 -> {
                    System.out.println("Hora, numLobos y observaciones:");
                    parque.add(new Lobos(sc.nextInt(), sc.nextInt(), sc.next()));
                }
                case 4 -> {
                    for (Avistamiento a : parque) {
                        if (a.getHora() >= 8) System.out.println(a);
                    }
                }
                case 5 -> {
                    for (Avistamiento a : parque) {
                        if (a.getHora() >= 20 || a.getHora() < 8) System.out.println(a);
                    }
                }
                case 6 -> {
                    for (Avistamiento a : parque) {
                        if (a instanceof Lobos) System.out.println(a);
                    }
                }
                case 7 -> {
                    for (Avistamiento a : parque) {
                        if (a instanceof Serpiente) System.out.println(a);
                    }
                }
                case 8 -> {
                    for (Avistamiento a : parque) {
                        if (a instanceof Pajaros) System.out.println(a);
                    }
                }
            }
        } while (opcion != 9);
    }
}