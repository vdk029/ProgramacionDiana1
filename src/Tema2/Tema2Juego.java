package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2Juego {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rd = new Random();

        int velocidad1, ataque1, defensa1, vidaMax1;
        int velocidad2, ataque2, defensa2, vidaMax2;

        //dado swtich
        int dado=0;

        boolean primerJugador1=true;
        boolean segundoJugador2=true;

        double danyoReal1;
        double danyoReal2;

        double defensaEfectiva1=0;
        double defensaEfectiva2=0;
        //info de los jugadores
        do {
            System.out.println(" introduce datos jugador 1 maximo 500 entre todos los atributos y maximo 200 por cada atributo");
            System.out.print("Velocidad: ");
            velocidad1 = input.nextInt();
            System.out.print("Ataque: ");
            ataque1 = input.nextInt();
            System.out.print("Defensa: ");
            defensa1 = input.nextInt();
            System.out.print("Puntos de vida: ");
            vidaMax1 = input.nextInt();
        } while (velocidad1 + ataque1 + defensa1 + vidaMax1 > 500 ||
                velocidad1 < 1 || velocidad1 > 200 ||
                ataque1 < 1 || ataque1 > 200 ||
                defensa1 < 1 || defensa1 > 200 ||
                vidaMax1 < 1 || vidaMax1 > 200);

        do {
            System.out.println("introduce datos jugador 2 maximo 500 entre todos los atributos y maximo 200 por cada atributo");
            System.out.print("Velocidad:");
            velocidad2 = input.nextInt();
            System.out.print("Ataque:");
            ataque2 = input.nextInt();
            System.out.print("Defensa:");
            defensa2 = input.nextInt();
            System.out.print("Puntos de vida:");
            vidaMax2 = input.nextInt();
        } while (velocidad2 + ataque2 + defensa2 + vidaMax2 > 500 ||
                velocidad2 < 1 || velocidad2 > 200 ||
                ataque2 < 1 || ataque2 > 200 ||
                defensa2 < 1 || defensa2 > 200 ||
                vidaMax2 < 1 || vidaMax2 > 200);


        {
            int vida1 = vidaMax1;
            int vida2 = vidaMax2;
            int ronda = 1;
            input.nextLine();
            System.out.println("que empiece la pelea");
            input.nextLine();


            //Pelea
            while (vida1 > 0 && vida2 > 0) {
                System.out.println("********************");
                System.out.println("RONDA " + ronda);

                // cada corazon son 10 puntos de vida.
                System.out.print("Jugador 1: " + vida1 + " ");
                for (int i = 0; i < vida1 / 10; i++) System.out.print("❤️");
                for (int i = vida1 / 10; i < vidaMax1 / 10; i++) System.out.print("🤍");
                System.out.println();

                System.out.print("Jugador 2: " + vida2 + " ");
                for (int i = 0; i < vida2 / 10; i++) System.out.print("❤️");
                for (int i = vida2 / 10; i < vidaMax2 / 10; i++) System.out.print("🤍");
                System.out.println();

                //Ataque.
                if (velocidad1 > velocidad2) {
                    primerJugador1= true;
                    System.out.println("Ataca el jugador 1");
                    System.out.println("Pulsa Enter para comenzar el combate:");
                    input.nextLine();
                }else if(velocidad2>velocidad1) {
                    primerJugador1 = false;
                }
                else if (velocidad1 == velocidad2) {
                    dado = rd.nextInt(6) + 1;
                    System.out.println("Tira el dado para ver quien empieza");
                    input.nextLine();
                    System.out.println("Ha salido " + dado);
                    if (dado <= 3) {
                        System.out.println("Ha salido " + dado);
                        System.out.println("Ataca el jugador 1");
                        System.out.println("Pulsa Enter para comenzar el combate:");
                        input.nextLine();
                    } else if (dado > 4 || dado <= 6) {
                        System.out.println("Ha salido " + dado);
                        System.out.println("Ataca el jugador 2");
                        System.out.println("Pulsa Enter para comenzar el combate:");
                        input.nextLine();
                    }


                    //DADOS
                    switch (dado) {
                        case 1:
                            System.out.println("+-------+");
                            System.out.println("|       |");
                            System.out.println("|   ⚫   |");
                            System.out.println("|       |");
                            System.out.println("+-------+");
                            break;

                        case 2:
                            System.out.println("+-------+");
                            System.out.println("| ⚫     |");
                            System.out.println("|       |");
                            System.out.println("|     ⚫ |");
                            System.out.println("+-------+");
                            break;

                        case 3:
                            System.out.println("+-------+");
                            System.out.println("| ⚫     |");
                            System.out.println("|   ⚫   |");
                            System.out.println("|     ⚫ |");
                            System.out.println("+-------+");
                            break;

                        case 4:
                            System.out.println("+-------+");
                            System.out.println("| ⚫   ⚫ |");
                            System.out.println("|       |");
                            System.out.println("| ⚫   ⚫ |");
                            System.out.println("+-------+");
                            break;

                        case 5:
                            System.out.println("+-------+");
                            System.out.println("| ⚫   ⚫ |");
                            System.out.println("|   ⚫   |");
                            System.out.println("| ⚫   ⚫ |");
                            System.out.println("+-------+");
                            break;

                        case 6:
                            System.out.println("+-------+");
                            System.out.println("| ⚫   ⚫ |");
                            System.out.println("| ⚫   ⚫ |");
                            System.out.println("| ⚫   ⚫ |");
                            System.out.println("+-------+");
                            break;

                        default:
                            System.out.println("Numero invalido");
                            break;
                    }
                }

                    if (primerJugador1) {
                        System.out.println("Jugador 1 ataca a Jugador 2. Pulsa Enter para tirar el dado de ATAQUE...");
                        input.nextLine();
                        dado = rd.nextInt(6) + 1;

                        double danyoBase1 = ataque1 * (dado / 6.0);
                        if (dado == 6) {
                            danyoBase1 *= 2;
                            System.out.println("Instakill");
                        }
                        System.out.println("Jugador 1 ha sacado un " + dado + " Hace daño " +  danyoBase1);

                        System.out.println("Jugador 2 defiende. Pulsa Enter para tirar el dado de DEFENSA...");
                        input.nextLine();
                        int dadoDef2 = rd.nextInt(6) + 1;
                         defensaEfectiva2 = defensa2 * (dado / 6.0);
                        System.out.println("Jugador 2 ha sacado un " + dado + " se defiende : " +  defensaEfectiva2);

                        danyoReal1 =(danyoBase1 - defensaEfectiva2);
                        vida2 -= danyoReal1;
                        if (vida2 < 0) vida2 = 0;
                        System.out.println("Jugador 1 causa "+danyoReal1);

                        if (vida2 > 0) {
                            // --- JUGADOR 2 ATACA ---
                            System.out.println("Jugador 2 ataca a Jugador 1. Pulsa Enter para tirar el dado de ATAQUE...");
                            input.nextLine();
                            int dadoAtaque2 = rd.nextInt(6) + 1;

                            double danyoBase2 = ataque2 * (dado / 6.0);
                            if (dadoAtaque2 == 6) {
                                danyoBase2 *= 2;
                                System.out.println("Instakill");
                            }
                            System.out.println("Jugador 2 ha sacado un " + dado + " Hace daño " +danyoBase2);

                            System.out.println("Jugador 1 defiende. Pulsa Enter para tirar el dado de DEFENSA...");
                            input.nextLine();
                            dado = rd.nextInt(6) + 1;

                             defensaEfectiva1 = defensa1 * (dado/ 6.0);
                            System.out.println("Jugador 1 ha sacado un " + dado + " se defiende : " +  defensaEfectiva2);

                             danyoReal2 = (danyoBase2 - defensaEfectiva1);
                            vida1 -= danyoReal2;
                            if (vida1 < 0) vida1 = 0;
                            System.out.println("Jugador 2 causa daño " + danyoReal2 );
                        }
                    } else {
                        // --- JUGADOR 2 ATACA PRIMERO ---
                        System.out.println("Jugador 2 ataca a Jugador 1. Pulsa Enter para tirar el dado de ATAQUE...");
                        input.nextLine();
                        dado = rd.nextInt(6) + 1;
                        double danyoBase2 = ataque2 * (dado/ 6.0);
                        if (dado == 6) {
                            danyoBase2 *= 2;
                            System.out.println("Instakill");
                        }
                        System.out.println("Jugador 2 ha sacado un " + dado + "Hace daño " +  danyoBase2);

                        System.out.println("Jugador 1 defiende. Pulsa Enter para tirar el dado de DEFENSA...");
                        input.nextLine();
                         dado = rd.nextInt(6) + 1;defensaEfectiva1 = defensa1 * (dado / 6.0);
                        System.out.println("Jugador 1 ha sacado un " + dado + " se defiende : " +  defensaEfectiva2);;

                        danyoReal2 = (danyoBase2 - defensaEfectiva1);
                        vida1 -= danyoReal2;
                        if (vida1 < 0) vida1 = 0;
                        System.out.println("Jugador 2 causa " + danyoReal2 );

                        if (vida1 > 0) {
                            System.out.println("Jugador 1 ataca a Jugador 2. Pulsa Enter para tirar el dado de ATAQUE...");
                            input.nextLine();
                             dado = rd.nextInt(6) + 1;

                            double danyoBase1 = ataque1 * (dado/ 6.0);
                            if (dado == 6) {
                                danyoBase1 *= 2;
                                System.out.println("GOLPE CRÍTICO");
                            }
                            System.out.println("Jugador 1 ha sacado un " + dado + " Hace daño " + danyoBase1);

                            System.out.println("Jugador 2 defiende. Pulsa Enter para tirar el dado de DEFENSA...");
                            input.nextLine();
                            defensaEfectiva2 = defensa2 * (dado / 6.0);
                            System.out.println("Jugador 2 ha sacado un " + dado + " se defiende " +  defensaEfectiva2);

                            danyoReal1 =(danyoBase1 - defensaEfectiva2);
                            vida2 -= danyoReal1;
                            if (vida2 < 0) vida2 = 0;
                            System.out.println("Jugador 1 causa " + danyoReal1 + " puntos de daño a Jugador 2");
                        }
                    }
                    ronda++;
                    input.nextLine();


                System.out.println("********************");
            } if (vida1 <= 0) {
            System.out.println("El JUGADOR 2 ha ganado");
        } else {
            System.out.println("El JUGADOR 1 ha ganado");
        }
        }


    }
}

