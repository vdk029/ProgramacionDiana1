package Tema7;

import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class Serializacion3 {
    public static void main(String[] args) {
        Path path = Paths.get("C:/Users/VOSKI/Desktop/Documentos", "texto.txt");
        int totalPalabras = 0;

        if (Files.exists(path)) {
            try {

                List<String> lineas = Files.readAllLines(path);

                for (String linea : lineas) {

                    if (!linea.trim().isEmpty()) {
                        // \\s+ detecta los espacios y convertimos el texto en un array de string
                        String[] palabras = linea.split("\\s+");
                        totalPalabras = totalPalabras + palabras.length;
                    }
                }

                System.out.println("Numero total de palabras: " + totalPalabras);

            } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
            }
        } else {
            System.out.println(" El archivo  no existe.");
        }
    }
}

