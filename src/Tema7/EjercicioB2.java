package Tema7;

import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class EjercicioB2 {
    public static void main(String[] args) throws IOException {
        String linea;
        double suma = 0;
        List<String> ordenarNotas = new ArrayList<>();
        double mediaNotas=0;

        try (BufferedReader br = new BufferedReader(new FileReader("Documentos/alumnos_notas.txt"))) {

            while ((linea = br.readLine()) != null) {
                String[] todo = linea.split(" ");

                String nombreAlumno = todo[0];
                String nombresApellidos = todo[1];
                ArrayList<Double> notas = new ArrayList<>();

                //array 2 porque 0 y 1 nombre y apellidos
                for (int i = 2; i < todo.length; i++) {
                    suma += Double.parseDouble(todo[i]);
                   mediaNotas++;
                }
                double media = suma / mediaNotas;


                System.out.println("Alumno: " + nombreAlumno + "Media: " + media);
            }
        }
    }
}
