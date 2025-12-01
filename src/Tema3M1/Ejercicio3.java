package Tema3M1;

import java.util.Scanner;

public class Ejercicio3 {
    public static boolean validRadius(double radius) {
        //return radius>=0;
        if(radius>=0){
          return true;

      }else
        return false;
    }

    public static double calculateCirclePerimeter(double radius) {
        double perimetro = 2 * 3.14 * radius;
        return perimetro;
    }
    public static double  calculateCircleArea(double radius){
        double area=3.14 * (radius * radius);
        return area;
    }

    public static void main(String[] args) {
        System.out.println("Introduce radio");
        Scanner input = new Scanner(System.in);
        double radius = input.nextInt();
        if(validRadius(radius)){
            System.out.println("El calculo del perimetro es: "+ calculateCirclePerimeter(radius));
            System.out.println("El calculo del area es: " +calculateCircleArea(radius));

        }else {
            System.out.println("error");
        }

    }
}