package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio23 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int contador = 0;
        int suma = 0;
        int numero;
        do {
            System.out.println("Dime un numero ");
            numero = input.nextInt();
            if (numero > 0) {
                suma = suma + numero;
                contador++;
            }
        } while (numero >= 0);
        if(contador>0){
            double media= suma/contador;
            System.out.println("La media de numeros es" +media);
        }else{
            System.out.println("no hay numeros positivos ");
        }
        input.close();
    }
}
