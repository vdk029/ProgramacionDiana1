package Tema3M1;

import static Tema3M1.Ejercicio5.tableMult;

public class Ejercicio6 {
    public static void allTables() {
        for (int i = 1; i < 11; i++)
            tableMult(i);

    }

    public static void main(String[] args) {

        System.out.println("las tablas de multplicar");
        allTables();
    }
}


