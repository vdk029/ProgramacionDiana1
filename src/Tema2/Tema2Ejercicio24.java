package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuantos alumnos hay?");
        int alumnos = input.nextInt();

        int contadorAprobados = 0;
        int contadorSuspendidos = 0;
        for (int i = 1; i <= alumnos; i++) {
            System.out.println("Dime sus notas");
            double nota = input.nextDouble();
            if(nota>=11 || nota<0){
                System.out.println("pon una nota valida de 0 a 10 ");
                input.nextDouble();
            }else{
                System.out.println("nota valida");
            }
            if (nota >= 5 ) {
                contadorAprobados++;
            } else {
                contadorSuspendidos++;

            }
        }
        input.close();
        System.out.println("alumnos aprobados:" + contadorAprobados);
        System.out.println("alumnos suspendidos:" + contadorSuspendidos);
    }
}
