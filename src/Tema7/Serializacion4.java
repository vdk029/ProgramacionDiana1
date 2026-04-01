package Tema7;

import java.io.*;
import java.nio.file.*;

public class Serializacion4 {
    public static void main(String[] args) {
        Persona p1 = new Persona("Pepe", 25);
        Path path = Paths.get("C:/Users/VOSKI/Desktop/Documentos", "persona.dat");


        try (OutputStream outStream = Files.newOutputStream(path);
             ObjectOutputStream objetoStream = new ObjectOutputStream(outStream)) {


            objetoStream.writeObject(p1);

            System.out.println(" Objeto Persona guardado ");

        } catch (IOException e) {
            System.out.println("Error al serializar: " + e.getMessage());
        }
    }
}

