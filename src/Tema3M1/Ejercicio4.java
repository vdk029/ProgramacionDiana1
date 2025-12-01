package Tema3M1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void showMenu() {
        System.out.println("Convertir a euros 1");
        System.out.println("Convertir dolares 2");
        System.out.println("SALIR 3");
    }


    public static double conDolares(double dolares) {
        return dolares * 0.87;
    }

    public static double conEuros(double euros) {
        return euros * 1.13;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double coin = 0;
        showMenu();
        System.out.println("dime la opcion:");
        int menu = input.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Introduce las monedas");
                coin = conDolares(input.nextDouble());
                System.out.println("el cambio a dolares son :" + conEuros(coin));
                break;
            case 2:
                System.out.println("Introduce las monedas");
                coin=conEuros(input.nextDouble());
                System.out.println("el cambio a euros son: "+ conDolares(coin));
                break;
            default:
                System.out.println("error");
                break;
        }


    }
}
