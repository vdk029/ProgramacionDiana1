package Tema7;

import java.nio.file.*;
import java.util.*;
import java.io.IOException;

public class EjercicioB4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String rutaBase = "C:/Users/VOSKI/Desktop/Documentos/";

        try {
            List<String> nombres = Files.readAllLines(Paths.get(rutaBase + "usa_nombres.txt"));
            List<String> apellidos = Files.readAllLines(Paths.get(rutaBase + "usa_apellidos.txt"));

            System.out.print("cantidad nombres a añadir ");
            int cantidad = sc.nextInt();
            sc.nextLine();
            System.out.print("en que texto lo guardamos? ");
            String archivoDestino = sc.nextLine();

            Path pathDestino = Paths.get(rutaBase + archivoDestino);
            List<String> nuevosNombres = new ArrayList<>();

            for (int i = 0; i < cantidad; i++) {
                String nombreNuevo = nombres.get(random.nextInt(nombres.size()));
                String apellidoNuevo = apellidos.get(random.nextInt(apellidos.size()));
                nuevosNombres.add(nombreNuevo + (" ") + apellidoNuevo);
            }

            Files.write(pathDestino, nuevosNombres);
            System.out.println("Se han añadido " + cantidad + " nombres ");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}