package Tema5;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio2Excepciones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            //dara error si algun num es 0
            System.out.println("DIme un numero");
            int num1= input.nextInt();

            System.out.println("dime otro numero");
            int num2=input.nextInt();
            int resultado=num1/num2;
            System.out.println(resultado);
        }catch (ArithmeticException exception){
            System.out.println("error no puedes dividir por 0 ");
        }catch (InputMismatchException exception){
            System.out.println("error no puedes dividir por 0 ");
        }
    }
}
