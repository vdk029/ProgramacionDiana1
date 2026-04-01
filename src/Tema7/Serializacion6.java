package Tema7;


import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;

public class Serializacion6 {
    public static void main(String[] args) {
        Path path = Paths.get("C:/Users/VOSKI/Desktop/Documentos", "personas.dat");

        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(new Persona("Diana", 25));
        lista.add(new Persona("Angela", 30));
        lista.add(new Persona("Monica", 20));


        try (OutputStream outStream = Files.newOutputStream(path);
             ObjectOutputStream objetoStream = new ObjectOutputStream(outStream)) {

            objetoStream.writeObject(lista);
            System.out.println("Lista de personas guardada.");

        } catch (IOException e) {
            System.out.println("Error al guardar la lista" + e.getMessage());
        }
    }
}

