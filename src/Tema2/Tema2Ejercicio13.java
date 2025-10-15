package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dime una hora");
        int hora = input.nextInt();
        System.out.println("Dime los minutos");
        int minutos = input.nextInt();
        System.out.println("Dime los segundos");
        int segundos = input.nextInt();
        segundos++;

        if (hora < 0 || minutos < 0 || minutos > 60 || segundos < 0 || segundos > 60) {
            System.out.println("Hora invaida, vuelve a poner la hora:");
            hora=input.nextInt();
            minutos = input.nextInt();
            segundos = input.nextInt();
        }

        if (segundos == 60) {
            segundos = 0;
            minutos++;
        }
        if (minutos == 60) {
            minutos = 0;
            hora++;
        }
        System.out.println("Las hora es:" + hora + ":" + minutos + ":" + segundos);
        input.close();
    }
}

