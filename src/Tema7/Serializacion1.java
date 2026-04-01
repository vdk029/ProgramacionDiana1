package Tema7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Serializacion1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Path path = Paths.get("C:/Users/VOSKI/Desktop/Documentos", "usuario.txt");
        try {
            System.out.println("Dime una edad");
            int edad = input.nextInt();
            input.nextLine();
            System.out.println("dime tu nombre");
            String nombre = input.nextLine();

            String contenido = "Nombre: " + nombre + "\nEdad: " + edad;
            Files.writeString(path, contenido);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo" + e.getMessage());
            e.printStackTrace();
        }
    }
}
