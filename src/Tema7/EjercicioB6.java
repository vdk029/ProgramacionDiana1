package Tema7;

import java.nio.file.*;
import java.io.IOException;
import java.util.Scanner;

public class EjercicioB6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. Definimos la ruta usando la jerarquía de directorios [cite: 8]
        String rutaBase = "C:/Users/VOSKI/Desktop/Documentos/";
        Path pathPi = Paths.get(rutaBase + "pi-million.txt");

        try {
            System.out.println("Leyendo el millón de decimales de Pi...");
            String contenidoPi = Files.readString(pathPi);


            System.out.print("numero que quieres buscar en Pi: ");
            String buscar = sc.nextLine();
            //  acceso secuencial al contenido
            boolean encontrado = false;
            int longitudPi = contenidoPi.length();
            int longitudBuscar = buscar.length();


            for (int i = 0; i <= longitudPi ; i++) {
                longitudPi=longitudPi-longitudBuscar;
                boolean coincidenciaTotal = true;


                for (int j = 0; j < longitudBuscar; j++) {
                    if (contenidoPi.charAt(i + j) != buscar.charAt(j)) {
                        coincidenciaTotal = false;
                        System.out.println("posicion no encontrada");

                    }
                }

                    if (coincidenciaTotal==true) {
                        System.out.println("numero encontrado en posicion");

                }
            }
            if (encontrado) {
                System.out.println("el numero existe " + buscar);
            } else {
                System.out.println("el numero no existe" + buscar);
            }

        } catch (IOException e) {
            System.out.println("Error al acceder al archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
