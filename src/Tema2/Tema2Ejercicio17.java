package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("dime una opción (0: cuadrado, 1: rectángulo, 2: triángulo):");
        int opcion = input.nextInt();

        if (opcion == 0) {
            System.out.println("dime lado del cuadrado:");
            double lado = input.nextDouble();
            double superficie = lado * lado;
            double perimetro = 4 * lado;
            System.out.println("superficie del cuadrado: " + superficie);
            System.out.println("perimetro del cuadrado: " + perimetro);
        } else if (opcion == 1) {
            System.out.println("dime la base del rectangulo:");
            double base = input.nextDouble();
            System.out.println("dime la altura del rectangulo:");
            double altura = input.nextDouble();
            double superficie = base * altura;
            double perimetro = 2 * (base + altura);
            System.out.println("superficie del rectangulo: " + superficie);
            System.out.println("perimetro del rectangulo: " + perimetro);
        } else if (opcion == 2) {
            System.out.println("dime la base del triangulo:");
            double base = input.nextDouble();
            System.out.println("dime la altura del triangulo:");
            double altura = input.nextDouble();
            double superficie = (base * altura) / 2;
            System.out.println("superficie del triangulo: " + superficie);
        } else {
            System.out.println("Opcion no valida.");
        }

        input.close();
    }
}

