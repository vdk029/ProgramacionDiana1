package Tema7;

import java.nio.file.*;
import java.io.IOException;
import java.util.*;


public class EjercicioB3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rutaBase = "C:/Users/VOSKI/Desktop/Documentos/";

        System.out.print("Nombre del archivo a copiar con la extension txt: ");
        String nombreA = sc.nextLine();
        System.out.print("Como quieres guardar la copia ?: ");
        String nombreB = sc.nextLine();


        // ponemos ruta base y luego se lo declaras a cada uno
        Path pathA = Paths.get(rutaBase + nombreA);
        Path pathB = Paths.get(rutaBase + nombreB);

        try {

            //leer archivo
            List<String> lineas = Files.readAllLines(pathA);

            //ordenar alfabeticamente
            Collections.sort(lineas);

            //sobreescribir el archivo
            Files.write(pathB, lineas);

            System.out.println("nuevo archivo creado ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}