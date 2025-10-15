package Tema1;
import java.util.Scanner;

public class Tema1Ejercicio6 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Dime el radio del ciruclo:");
        int radio = input.nextInt();
        double calc= radio * (3.14* 3.14);
        System.out.println(calc);
    }
}
