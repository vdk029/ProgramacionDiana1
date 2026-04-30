package Tema8;

import java.sql.*;

public class RepasoSQL {
    public static void main(String[] args) {

        // Usamos la clase Conexion que ya creamos para conectar a AWS
        try (Connection con = Conexion.conectar()) {
            System.out.println("--- Conectado a AWS para el repaso ---");

            // EJERCICIO 1: Nombres y apellidos de todos los profesores
            String sql1 = "SELECT nombre, apellido FROM profesor";
            try (PreparedStatement ps1 = con.prepareStatement(sql1);
                 ResultSet rs1 = ps1.executeQuery()) {
                System.out.println("\n1. Profesores:");
                while (rs1.next()) {
                    System.out.println("- " + rs1.getString("nombre") + " " + rs1.getString("apellido"));
                }
            }

            // EJERCICIO 2: Estudiantes nacidos después del 1 de enero de 1980
            // Clave: Las fechas en SQL van entre comillas simples '1980-01-01'
            String sql2 = "SELECT nombre, apellido FROM estudiante WHERE fecha_nacimiento > '1980-01-01'";
            try (PreparedStatement ps2 = con.prepareStatement(sql2);
                 ResultSet rs2 = ps2.executeQuery()) {
                System.out.println("\n2. Estudiantes post-1980:");
                while (rs2.next()) {
                    System.out.println("- " + rs2.getString("nombre") + " " + rs2.getString("apellido"));
                }
            }

            // EJERCICIO 3: Estudiantes ordenados por fecha de nacimiento (ASC)
            String sql3 = "SELECT nombre, apellido FROM estudiante ORDER BY fecha_nacimiento ASC";
            try (PreparedStatement ps3 = con.prepareStatement(sql3);
                 ResultSet rs3 = ps3.executeQuery()) {
                System.out.println("\n3. Estudiantes ordenados por fecha:");
                while (rs3.next()) {
                    System.out.println("- " + rs3.getString("nombre") + " (" + rs3.getDate("fecha_nacimiento") + ")");
                }
            }

            // EJERCICIO 4: Cuántos estudiantes hay en cada casa
            // Necesitamos un JOIN entre 'casa' y 'estudiante' y un GROUP BY
            String sql4 = "SELECT c.nombre_casa, COUNT(e.id_estudiante) AS total " +
                    "FROM casa c " +
                    "LEFT JOIN estudiante e ON c.id_casa = e.id_casa " +
                    "GROUP BY c.nombre_casa";
            try (PreparedStatement ps4 = con.prepareStatement(sql4);
                 ResultSet rs4 = ps4.executeQuery()) {
                System.out.println("\n4. Estudiantes por casa:");
                while (rs4.next()) {
                    System.out.println("- " + rs4.getString("nombre_casa") + ": " + rs4.getInt("total"));
                }
            }

            // EJERCICIO 5: Calificación media y máxima en "Pociones"
            String sql5 = "SELECT AVG(ea.calificacion) AS media, MAX(ea.calificacion) AS maxima " +
                    "FROM estudiante_asignatura ea " +
                    "JOIN asignatura a ON ea.id_asignatura = a.id_asignatura " +
                    "WHERE a.nombre_asignatura = 'Pociones'";
            try (PreparedStatement ps5 = con.prepareStatement(sql5);
                 ResultSet rs5 = ps5.executeQuery()) {
                System.out.println("\n5. Estadísticas de Pociones:");
                if (rs5.next()) {
                    System.out.println("- Media: " + rs5.getDouble("media"));
                    System.out.println("- Máxima: " + rs5.getDouble("maxima"));
                }
                // EJERCICIO 6: Mostrar años de curso sin duplicados (DISTINCT)
                String sql6 = "SELECT DISTINCT anyo_curso FROM estudiante";
                try (PreparedStatement ps6 = con.prepareStatement(sql6);
                     ResultSet rs6 = ps6.executeQuery()) {
                    System.out.println("\n6. Años de curso disponibles:");
                    while (rs6.next()) {
                        System.out.println("- Año: " + rs6.getInt("anyo_curso"));
                    }
                }

                // EJERCICIO 7: Estudiantes cuyo apellido empieza por 'P' (LIKE)
                String sql7 = "SELECT nombre, apellido FROM estudiante WHERE apellido LIKE 'P%'";
                try (PreparedStatement ps7 = con.prepareStatement(sql7);
                     ResultSet rs7 = ps7.executeQuery()) {
                    System.out.println("\n7. Apellidos que empiezan por P:");
                    while (rs7.next()) {
                        System.out.println("- " + rs7.getString("nombre") + " " + rs7.getString("apellido"));
                    }
                }

                // EJERCICIO 8: Estudiantes en su 4º o 5º año (IN)
                String sql8 = "SELECT nombre, apellido, anyo_curso FROM estudiante WHERE anyo_curso IN (4, 5)";
                try (PreparedStatement ps8 = con.prepareStatement(sql8);
                     ResultSet rs8 = ps8.executeQuery()) {
                    System.out.println("\n8. Estudiantes de 4º y 5º año:");
                    while (rs8.next()) {
                        System.out.println("- " + rs8.getString("nombre") + " (" + rs8.getInt("anyo_curso") + "º)");
                    }
                }
            }

        } catch (Exception e) {
            System.err.println("Error en el repaso: " + e.getMessage());
            e.printStackTrace();
        }
    }
}