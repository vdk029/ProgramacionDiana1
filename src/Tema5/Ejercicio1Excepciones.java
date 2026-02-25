package Tema5;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio1Excepciones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("DIme un numero");
         //Antes de poner el escaner
        try{
            num=input.nextInt();
            System.out.println("Numero"+num);
        }catch (InputMismatchException exception){
            //si lo ponemos mal vamos aqui.
            System.err.println("VAlor introducido incorrecto");
            System.err.println(exception.getMessage());
        }
    }

}
