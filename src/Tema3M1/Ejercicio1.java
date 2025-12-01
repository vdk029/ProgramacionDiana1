package Tema3M1;

import java.util.Scanner;
public class Ejercicio1 {
    public static int numberSign( int numero) {

        if (numero<0) {
            return -1;
        } else if (numero > 0) {
          return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Dime un numero");
      int numero = input.nextInt();
      numberSign(numero);
    }
}
