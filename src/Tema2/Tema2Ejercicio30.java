package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numero1, numero2, resultado;
        int casos = 0;

        while (casos != 5) {
            System.out.println("Calculadora ");
            System.out.println("Elige una operacion:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");
            casos = input.nextInt();


            if (casos < 0 || casos > 5) {
                System.out.println("Opcion incorrecta");

            }


            switch (casos) {
                case 1:
                    System.out.print("Introduce el 1er numero: ");
                    numero1 = input.nextDouble();

                    System.out.print("Introduce el 2do numero: ");
                    numero2 = input.nextDouble();
                    resultado = numero1 + numero2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    System.out.print("Introduce el 1er numero: ");
                    numero1 = input.nextDouble();

                    System.out.print("Introduce el 2do numero: ");
                    numero2 = input.nextDouble();
                    resultado = numero1 - numero2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    System.out.print("Introduce el 1er numero: ");
                    numero1 = input.nextDouble();

                    System.out.print("Introduce el 2do numero: ");
                    numero2 = input.nextDouble();
                    resultado = numero1 * numero2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    System.out.print("Introduce el 1er numero: ");
                    numero1 = input.nextDouble();

                    System.out.print("Introduce el 2do numero: ");
                    numero2 = input.nextDouble();
                    if (numero2 == 0) {
                        System.out.println("Error: no se puede dividir entre cero.");
                    } else {
                        resultado = numero1 / numero2;
                        System.out.println("Resultado: " + resultado);
                    }
                    break;
                case 5: {
                    if (casos == 5) {
                        System.out.println("Adios");
                    }
                    break;
                }
            }
        }
    }
}
