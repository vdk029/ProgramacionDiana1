package Tema7;

import java.io.*;

public class EjerciciosB1 {
    public static void main(String[] args) {
        File archivo = new File("Documentos/numeros.txt");

        if (archivo.exists()) {
            System.out.println("El archivo existe");
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            String linea;

            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                while ((linea = br.readLine()) != null) {
                    //el trim es para las lineas con espacio
                    if (!linea.trim().isEmpty()) {
                        int numeroActual = Integer.parseInt(linea.trim());
                        // compriebas los numeros teniendo el maximo como base para determinar el maximo
                        if (numeroActual > max) max = numeroActual;
                        if (numeroActual < min) min = numeroActual;
                    }
                }
                //COmprobar si el archivo esta vacio
                // Si el numero max es igual que el MIN_VALUE quiere decir que comparo mas numeros y el archivo estaba vacio
                if (max == Integer.MIN_VALUE) {
                    System.out.println("El archivo estaba vacio.");
                } else {
                    System.out.println("Max: " + max);
                    System.out.println("Min: " + min);
                }

            } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Error: Hay un dato no numérico en el archivo.");
            }

        } else {
            System.out.println("Error: El archivo no se encuentra en la ruta.");
        }
    }
}
