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


            // reocrrer abecedario
            for (char letra = 'A'; letra <= 'Z'; letra++) {
                List<String> palabrasFiltradas = new ArrayList<>();


                // crear el archivo para que por letra escriba el diccionario
                Path archivoLetra = carpetaDiccionario.resolve(letra + ".txt");

                Files.write(archivoLetra, palabrasFiltradas);
            }

            //bufered reader filtradno por chart a
            //lees el diccionario.txt, vas cogiendo el primer caracter de todas las palabras, y escribes cada palabra en el archivo que corresponda


            System.out.println("archivos creados en la carpeta Diccionario.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
