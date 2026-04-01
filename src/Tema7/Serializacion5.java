package Tema7;


import java.io.*;
import java.nio.file.*;

public class Serializacion5 {
    public static void main(String[] args) {
        Path path = Paths.get("C:/Users/VOSKI/Desktop/Documentos", "persona.dat");

        if (Files.exists(path)) {
            try (InputStream inputStream = Files.newInputStream(path);
                 ObjectInputStream objetoInput = new ObjectInputStream(inputStream)) {

                Persona p = (Persona) objetoInput.readObject();
                System.out.println(p);

            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error al leer el objeto: " + e.getMessage());
            }
        } else {
            System.out.println(" El archivo no existe.");
        }
    }
}