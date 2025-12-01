package Tema3M2;

import java.util.Scanner;

public class Tema3Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double lado = input.nextDouble();
        System.out.println("Perimetro cuadrado" + Tema3M2.MyMath.squarePerimeter(lado));
        System.out.println("Area cuadrado" + Tema3M2.MyMath.squareArea(lado));
        double largo = input.nextDouble();
        double ancho = input.nextDouble();
        System.out.println("Perimetro rectangulo" + Tema3M2.MyMath.rectanglePerimeter(largo, ancho));
        System.out.println("Area rectangulo" + Tema3M2.MyMath.rectangleArea(largo, ancho));
        double radius = input.nextDouble();
        System.out.println("Perimetro circulo" + Tema3M2.MyMath.circleArea(radius));
        System.out.println("Area circulo");
        input.close();

    }
}
