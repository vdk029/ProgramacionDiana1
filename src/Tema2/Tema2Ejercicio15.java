package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dime el numero de mes:");
        int mes = input.nextInt();
        System.out.println("Dime el año");
        int anyo = input.nextInt();
        if ((anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0)) {
            System.out.println("Año bisiesto");
        } else {
            System.out.println("No es año bisiesto");
        }
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            int dia = 31;
            System.out.println("Este mes tiene" + dia + "dias");
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            int dia = 30;
            System.out.println("Este mes tiene" + dia + "dias");
        } else if (mes == 2) {

            int dia = 29;
            System.out.println("Este mes tiene " + dia + "y el  mes de febrero con 29 dias");
        } else {

            int dia = 28;
            System.out.println("Este mes tiene " + dia);
        }
        input.close();
    }
}
