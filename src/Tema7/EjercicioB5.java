package Tema7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EjercicioB5 {
    public static void main(String[] args) {
        String rutaBase = "C:/Users/VOSKI/Desktop/Documentos/";
        Path carpetaDiccionario = Paths.get(rutaBase + "Diccionario");
        Path origenRuta = Paths.get(rutaBase + "diccionario.txt");

        try {
            // Crear la carpeta Diccionario
            if (!Files.exists(carpetaDiccionario)) {
                Files.createDirectory(carpetaDiccionario);
                System.out.println("Carpeta creada.");
            }

            List<String> allWords = Files.readAllLines(origenRuta);

            // reocrrer abecedario
            for (char letra = 'A'; letra <= 'Z'; letra++) {
                List<String> palabrasFiltradas = new ArrayList<>();
                String letraString = String.valueOf(letra);

                // filtrar por palabras
                for (String palabra : allWords) {
                    if (palabra.toUpperCase().startsWith(letraString)) {
                        palabrasFiltradas.add(palabra);
                    }
                }

                // crear el archivo para que por letra escriba el diccionario
                Path archivoLetra = carpetaDiccionario.resolve(letra + ".txt");

                Files.write(archivoLetra, palabrasFiltradas);
            }

            System.out.println("archivos creados en la carpeta Diccionario.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
