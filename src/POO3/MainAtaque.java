package POO3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainAtaque{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<AtaqueAvanzado> misAtaques = new ArrayList<>();
        misAtaques.add(new AtaqueMagico());


        System.out.println("--- MENU DE COMBATE ---");
        System.out.println("1. Lanzar todos los ataques");
        System.out.println("2. Calcular danyo total de la bolsa");
        int opcion = input.nextInt();

        if (opcion == 1) {
            for (int i = 0; i < misAtaques.size(); i++) {
                AtaqueAvanzado a = misAtaques.get(i);

                a.lanzar();
                System.out.println("Coste: " + a.coste());
                System.out.println("Danyo: " + a.danyoInfligido());

            }
        } else if (opcion == 2) {
            int danyoAcumulado = 0;
            for (int i = 0; i < misAtaques.size(); i++) {
                danyoAcumulado += misAtaques.get(i).danyoInfligido();
            }
            System.out.println("El danyo total de tu equipo es: " + danyoAcumulado);
        }
    }
}