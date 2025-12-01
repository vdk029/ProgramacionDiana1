package Tema3M2;

import Tema3M2.MyMath;

import java.util.Scanner;


public class Tema3Ejercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double lado = input.nextDouble();
        System.out.println("Perimetro cuadrado: " + MyMath.squarePerimeter(lado));
        System.out.println("Área cuadrado: " + MyMath.squareArea(lado));

        double largo = input.nextDouble();
        double ancho = input.nextDouble();
        System.out.println("Perimetro rectangulo " + MyMath.rectanglePerimeter(largo, ancho));
        System.out.println("Area rectangulo" + MyMath.rectangleArea(largo, ancho));

        double radius = input.nextDouble();
        System.out.println("Perimetro ");
    }

}
