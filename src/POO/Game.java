package POO;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();


        Hero yo = new Hero("Yo", 200, 25, 10);

        int hordas = 0;

        System.out.println("COMIENZA EL JUEGO");
        System.out.println(yo);


        while (yo.getHealth() > 0) {
            hordas++;
            System.out.println("HORDA " + hordas);

            int numeroEnemigos = random.nextInt(3) + 1;

            ArrayList<Hero> enemigos = new ArrayList<>();

            for (int i = 0; i < numeroEnemigos; i++) {
                Hero malo = new Hero("MAlo" + (i + 1), 50, 15, 5);
                enemigos.add(malo);
                System.out.println("enemigo " + malo.getName() + "!");
            }

            while (yo.getHealth() > 0 && !enemigos.isEmpty()) {


                Hero enemigoActual = enemigos.get(0);
                yo.attack(enemigoActual);


                if (enemigoActual.getHealth() <= 0) {
                    System.out.println(enemigoActual.getName() + " ha muerto.");

                }


                for (int i = 0; i < enemigos.size(); i++) {
                    Hero malo = enemigos.get(i);

                    if (random.nextDouble() < 0.10) {
                        System.out.println(malo.getName() + " ");
                        enemigos.remove(i);
                        i--;
                    } else {
                        System.out.println(malo.getName() + " te ataca:");
                        malo.attack(yo);
                    }
                }


                System.out.println("Estado actual de tu  Vida es " + yo.getHealth());
            }


            if (yo.getHealth() > 0) {
                System.out.println("Horda " + hordas + " superada");


                if (random.nextDouble() < 0.10) {
                    System.out.println("Has encontrado una poción");
                    yo.drinkPotion();
                }

                if (random.nextDouble() < 0.001) {
                    System.out.println("Puedes descansar");
                    yo.rest();
                }
            }
        }

        System.out.println("HAs perdido");
        System.out.println("Has sobrevivido a " + (hordas - 1) + " hordas completas.");
    }
}