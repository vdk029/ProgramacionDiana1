package Tema7;

import java.nio.file.*;
import java.io.IOException;

public class Serializacion2 {
    public static void main(String[] args) {
        Path path = Paths.get("C:/Users/VOSKI/Desktop/Documentos", "usuario.txt");

        if (Files.exists(path)) {
            try {

                String contenido = Files.readString(path);

                System.out.println("Cotniene ");
                System.out.println(contenido);

            } catch (IOException e) {
                System.out.println(" Error al leer el archivo: " + e.getMessage());
            }
        } else {
            System.out.println("El archivo  no existe");
        }
    }
}