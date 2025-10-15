package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio1 {
    public static void main(String[] args) {
        //kjnk
        Scanner input = new Scanner(System.in);
        System.out.println("Dime el un lado del cuadrado:");
        int lado = input.nextInt();
        int area = lado * lado;
        int perimetro = lado * 4;

        System.out.println("el area es: " + area);
        System.out.println("el perimetro es: " + perimetro);
        input.close();
    }
}

