package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero de monedas");
        double monedas = input.nextDouble();
        System.out.println("Escribe d para convertir a dolares o e para convertir a euros");
        char opcion = input.next().charAt(0);

        if (opcion == 'd') {
            double conD = 1.16;
            conD = conD * monedas;
            System.out.println("monedas cambiadas: " + conD + " a dolares");
        } else if (opcion == 'e') {
            double conE = 0.86;
            conE = conE * monedas;
            System.out.println("monedas cambiadas " + conE + " a euros");
        } else {
            System.out.println("Conversion invalida tienes que poner d para dolares o e para euros ");
        }
        input.close();
    }
}

