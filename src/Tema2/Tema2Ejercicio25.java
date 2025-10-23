package Tema2;
import java.util.Scanner;
public class Tema2Ejercicio25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dime un numero");
        int factorial = 1;
        int numFactorial=input.nextInt();
         for (int i = numFactorial; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("el factorial es " +factorial);
    }
}
