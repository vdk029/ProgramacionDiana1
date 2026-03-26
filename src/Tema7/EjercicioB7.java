package Tema7;

import java.nio.file.*;
import java.io.IOException;
import java.util.*;

public class EjercicioB7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. Ruta base según la jerarquía de tu escritorio [cite: 8]
        String rutaLibros = "C:/Users/VOSKI/Desktop/Documentos/";

        System.out.print("Introduce el nombre del libro ");
        String nombreLibro = sc.nextLine();
        Path pathLibro = Paths.get(rutaLibros + nombreLibro);

        try {
            // 2. LECTURA: Obtenemos todas las líneas
            List<String> lineas = Files.readAllLines(pathLibro);

            long numLineas = lineas.size();
            long numPalabras = 0;
            long numCaracteres = 0;
            Map<String, Integer> frecuencias = new HashMap<>();

            for (String linea : lineas) {
                numCaracteres += linea.length();

                // Separamos la línea en palabras (limpiando espacios)
                String[] palabras = linea.toLowerCase().split("\\W+");

                for (String pal : palabras) {
                    if (!pal.isEmpty()) {
                        numPalabras++;
                        // Lógica de la Tabla Hash (Clave-Valor)
                        frecuencias.put(pal, frecuencias.getOrDefault(pal, 0) + 1);
                    }
                }
            }

            // 3. MOSTRAR ESTADÍSTICAS BÁSICAS
            System.out.println("--- ESTADÍSTICAS DE " + nombreLibro + " ---");
            System.out.println("Líneas: " + numLineas);
            System.out.println("Palabras: " + numPalabras);
            System.out.println("Caracteres: " + numCaracteres);

            // 4. LAS 10 MÁS COMUNES (Ordenación de la tabla)
            System.out.println("\nTop 10 palabras más frecuentes:");
            frecuencias.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .limit(10)
                    .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        } catch (IOException e) {
            // Gestión de errores según pág 12 [cite: 105]
            System.err.println("No se pudo leer el libro. Revisa el nombre.");
        }
    }
}
