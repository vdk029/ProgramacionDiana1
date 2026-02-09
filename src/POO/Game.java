package POO;

import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Hero player = new Hero(); // Nuestro héroe principal
        Random random = new Random();
        int hordasSobrevividas = 0;

        while (player.getHealth() > 0) {
            System.out.println("Horda " + (hordasSobrevividas + 1));
            int numEnemigos = random.nextInt(3) + 1; // Entre 1 y 3 enemigos
            Hero[] enemigos = new Hero[numEnemigos];

            // Crear los enemigos
            for (int i = 0; i < numEnemigos; i++) {
                Hero enemigo = new Hero();
                enemigo.setName("Enemigo " + (i + 1));
                enemigo.setHealth(random.nextInt(50) + 50); // Vida entre 50 y 100
                enemigo.setAttack(random.nextInt(10) + 5); // Ataque entre 5 y 15
                enemigo.setDefense(random.nextInt(5) + 2); // Defensa entre 2 y 6
                enemigos[i] = enemigo;
            }

            // Batalla con los enemigos
            while (player.getHealth() > 0 && numEnemigos > 0) {
                // Huida de enemigos
                for (int i = 0; i < numEnemigos; i++) {
                    if (enemigos[i] != null && random.nextDouble() < 0.10) {
                        System.out.println(enemigos[i].getName() + " ha huido.");
                        enemigos[i] = null; // El enemigo huye
                        numEnemigos--;
                    }
                }

                // Eliminar enemigos derrotados y atacar
                for (int i = 0; i < numEnemigos; i++) {
                    if (enemigos[i] != null) {
                        Hero enemigo = enemigos[i];
                        int danoCausado = Math.max(player.getAttack() - enemigo.getDefense(), 1);
                        enemigo.setHealth(enemigo.getHealth() - danoCausado);
                        System.out.println(player.getName() + " ataca a " + enemigo.getName() + " causando " + danoCausado + " de daño.");

                        if (enemigo.getHealth() <= 0) {
                            System.out.println(enemigo.getName() + " ha sido derrotado!");
                            enemigos[i] = null; // El enemigo es derrotado
                            numEnemigos--;
                        }
                    }
                }

                // Ataque de los enemigos al jugador
                for (int i = 0; i < numEnemigos; i++) {
                    if (enemigos[i] != null) {
                        Hero enemigo = enemigos[i];
                        int danoRecibido = enemigo.getAttack() - player.getDefense();
                        player.setHealth(player.getHealth() - danoRecibido);
                        System.out.println(enemigo.getName() + " ataca y causa " + danoRecibido + " de daño a " + player.getName() + ".");
                    }
                }
            }

            // Condiciones adicionales: descansar o poción
            if (random.nextDouble() < 0.001) { // 0.1% descansar
                player.rest();
                System.out.println(player.getName() + " ha descansado y recuperado vida.");
            }

            if (random.nextDouble() < 0.10) { // 10% poción
                player.drinkPotion();
                System.out.println(player.getName() + " encontró una poción y la bebió.");
            }

            hordasSobrevividas++;
        }

        System.out.println("Fin del juego. Sobreviviste a " + hordasSobrevividas + " hordas.");
    }
}

