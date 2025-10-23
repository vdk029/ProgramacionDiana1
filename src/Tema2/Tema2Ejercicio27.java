package Tema2;

public class Tema2Ejercicio27 {
    public static void main(String[] args) {
        int contadorPrimos = 0;
        int numPrimo = 2;
int comprobacionPrimo;
        while (contadorPrimos < 20) {
            comprobacionPrimo = 0;

            for (int i = 2; i < numPrimo; i++) {
                if (numPrimo% i == 0) {
                    comprobacionPrimo++;
                }
            }
            if (comprobacionPrimo == 0) {
                System.out.println(numPrimo);
                contadorPrimos++;
            }

            numPrimo++;
        }
    }
}