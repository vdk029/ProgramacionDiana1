package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dime la base del rectangulo");
        int base = input.nextInt();
        System.out.println("Dime la altura del rectangulo");
        int altura = input.nextInt();
        int area = base * altura;
        int perimetro = 2 * (base + altura);
        System.out.println("el area del rectangulo es: " + area);
        System.out.println("el perimetro del rectagulo es:" + perimetro);
        input.close();
    }
}
