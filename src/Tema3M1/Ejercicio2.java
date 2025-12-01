package Tema3M1;

import java.util.Scanner;
import static Tema3M1.Ejercicio1.numberSign;

public class Ejercicio2 {

    public static boolean isAdult(int age) {
        int sign = numberSign(age- 18);
        if (sign >= 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int age = input.nextInt();

        if (isAdult(age)) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}