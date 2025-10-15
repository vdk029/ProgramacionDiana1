package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dime la base del triangulo:");
        int base = input.nextInt();
        System.out.println("Dime la altura del triangulo");
        int altura = input.nextInt();
        int area = base * altura / 2;
        int perimetro = base + base + area;
        System.out.println("el area del triangulo es:" + area);
        System.out.println("el perimetro del triangulo es" + perimetro);
        input.close();
    }
}
