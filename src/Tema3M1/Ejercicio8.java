package Tema3M1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void fechas(int dia, int mes, int year) {
        //si el mes es abril, si te meto 31, es incorrrecto
        //si es febrero, solo puede ser 28 o 29, dependiendo de si es bisiesto
        if (dia < 1 || dia > 31) {
            System.out.println("fecha no valida");
        }
        if (mes < 1 || mes > 12) {
            System.out.println("fecha no valida");
        }
        if (year <= 0) {
            System.out.println("fecha no valida");
        } else {
            System.out.println(dia + "/" + mes + "/" + year);
        }
    }
//TODO: quitar los scanners de los parámetros de la función
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dime una fecha que sea dia , mes y año");
        int dia= input.nextInt();
        fechas(dia, input.nextInt(), input.nextInt());
    }
}

