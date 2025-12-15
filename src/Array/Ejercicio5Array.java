package Array;


import java.util.Random;
import java.util.Scanner;

public class Ejercicio5Array {

    public static void main(String[] args) {

        String[] parejas = new String[20];
        boolean[] visibles = new boolean[20];

        String[] animales = {
                "Leon", "Tigre", "Mono", "Perro", "Gato",
                "Vaca", "Cerdo", "Oso", "Pato", "Caballo"
        };

        int pos = 0;
        for (int i = 0; i < animales.length; i++) {
            parejas[pos++] = animales[i];
            parejas[pos++] = animales[i];
        }


        Random random = new Random();
        for (int i = 0; i < parejas.length; i++) {
            int j = random.nextInt(20);
            String aux = parejas[i];
            parejas[i] = parejas[j];
            parejas[j] = aux;
        }

        Scanner input = new Scanner(System.in);

        boolean terminado = false;

        while (!terminado) {


            System.out.println("\nTablero:");
            for (int i = 0; i < 20; i++) {
                if (visibles[i]) {
                    System.out.print(parejas[i] + " ");
                } else {
                    System.out.print((i + 1) + " ");
                }
            }
            System.out.println();


            System.out.print("Elige primera posicion (1-20): ");
            int p1 = input.nextInt() - 1;


            System.out.print("Elige segunda posicion (1-20): ");
            int p2 = input.nextInt() - 1;


            if (parejas[p1].equals(parejas[p2]) && p1 != p2) {
                System.out.println("Correcto, es una pareja");
                visibles[p1] = true;
                visibles[p2] = true;
            } else {
                System.out.println("No son iguales");

                for (int i = 0; i < 20; i++) {
                    System.out.println();
                }
            }


            terminado = true;
            for (int i = 0; i < visibles.length; i++) {
                if (!visibles[i]) {
                    terminado = false;
                }
            }
        }

        System.out.println("Has encontrado todas las parejas");
    }
}

