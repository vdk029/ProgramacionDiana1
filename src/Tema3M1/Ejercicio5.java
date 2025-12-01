package Tema3M1;

import java.util.Scanner;
public class Ejercicio5 {
    public static int tableMult(int numero) {
        for (int i = 1; i < 11; i++) {
           int multiplicacion=numero * i;
            System.out.println(multiplicacion);
        }
        return numero;
    }
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("DIme un numero para decirte la tabla");
        int numero=input.nextInt();
        System.out.println("La talbla de multiplicar"+tableMult(numero));

    }
}
