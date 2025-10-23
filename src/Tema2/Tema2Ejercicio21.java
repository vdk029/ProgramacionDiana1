package Tema2;

public class Tema2Ejercicio21 {
    public static void main(String[]args){
        int maximo = 1000;
        int suma=0;
        for (int i = 1; i <= maximo; i++) {
            if (i % 2 == 0) {
               suma=suma+i;
               System.out.println(suma);
            }
        }
    }
}

