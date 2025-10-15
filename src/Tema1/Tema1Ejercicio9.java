package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el primer numero entero: ");
        int num1 = input.nextInt();
        System.out.print("Introduce el segundo numero entero: ");
        int num2 = input.nextInt();

        int suma = num1 + num2;
        int producto = num1 * num2;
        int resta = num1 - num2;

        if (num2 != 0) {
            int division = num1 / num2;
            int resto = num1 % num2;
            System.out.println("La suma es: " + suma);
            System.out.println("El producto es: " + producto);
            System.out.println("La resta es: " + resta);
            System.out.println("la division es: " + division);
            System.out.println("el resto es: " + resto);
        } else {
            System.out.println("la suma es: " + suma);
            System.out.println("el producto es: " + producto);
            System.out.println("la resta es: " + resta);
            System.out.println("no se puede dividir entre 0.");
        }
        input.close();
    }
}