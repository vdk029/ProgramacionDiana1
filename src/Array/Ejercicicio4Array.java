package Array;

import java.util.Scanner;

public class Ejercicicio4Array {
    public static void main(String[] args) {

        int[] habitaciones = new int[20];


        Scanner input = new Scanner(System.in);


        System.out.print("Selecciona el numero de habitacion (1-20)  ");
        int habitacion = input.nextInt();

        while (habitacion < 1 || habitacion > 20) {
            System.out.print("pon  una habitacion válida entre 1 y 20: ");
            habitacion = input.nextInt();
        }


        System.out.print("potencia del router (1-6): ");
        int potencia = input.nextInt();


        while (potencia < 1 || potencia > 6) {
            System.out.print("pon una potencia valida entre 1 y 6: ");
            potencia = input.nextInt();
        }


        habitacion--;


        for (int i = 0; i < 20; i++) {

            int distancia = Math.abs(habitacion - i);


            if (distancia <= potencia) {
                habitaciones[i] = potencia - distancia;
            } else {
                habitaciones[i] = 0;
            }
        }


        System.out.println("wifi en las habitaciones:");
        for (int i = 0; i < 20; i++) {
            System.out.print(habitaciones[i] + " ");
        }

     input.close();
    }
}

