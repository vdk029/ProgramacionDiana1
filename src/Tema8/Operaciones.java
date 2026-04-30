package Tema8;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Operaciones {

    // 1. Consulta de estudiantes por casa
    public void getEstudiantePorCasa(String nombreCasa) {
        String sql = "SELECT e.nombre, e.apellido FROM Estudiante e " +
                "JOIN Casa c ON e.id_casa = c.id_casa WHERE c.nombre = ?";

        try (Connection conn = Conexion.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombreCasa);
            ResultSet rs = pstmt.executeQuery();

            System.out.println("--- Estudiantes de " + nombreCasa + " ---");
            while (rs.next()) {
                System.out.println(rs.getString("nombre") + " " + rs.getString("apellido"));
            }
        } catch (SQLException | IOException e) {
            System.out.println("Error en Ejercicio 1: " + e.getMessage());
        }
    }

    // 2. Obtener la mascota de un estudiante específico
    public void getMascotaEstudiante(String nombre, String apellido) {
        // Cambiamos 'mascota' por 'Mascota' y 'estudiante' por 'Estudiante'
        String sql = "SELECT m.nombre FROM Mascota m " +
                "JOIN Estudiante e ON m.id_estudiante = e.id_estudiante " +
                "WHERE e.nombre = ? AND e.apellido = ?";

        try (Connection conn = Conexion.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombre);
            pstmt.setString(2, apellido);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                System.out.println("La mascota de " + nombre + " es: " + rs.getString("nombre"));
            } else {
                System.out.println(nombre + " no tiene mascota registrada.");
            }
        } catch (SQLException | IOException e) {
            System.out.println("Error en Ejercicio 2: " + e.getMessage());
        }
    }

    // 3. Número de estudiantes por casa
    public void contarEstudiantesPorCasa() {
        // Cambiamos 'casa' por 'Casa' y 'id_casa' por el nombre correcto de la relación
        String sql = "SELECT c.nombre, COUNT(e.id_estudiante) as total " +
                "FROM Casa c LEFT JOIN Estudiante e ON c.id_casa = e.id_casa " +
                "GROUP BY c.nombre";

        try (Connection conn = Conexion.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("--- Censo de Hogwarts ---");
            while (rs.next()) {
                System.out.println(rs.getString("nombre") + ": " + rs.getInt("total") + " estudiantes");
            }
        } catch (SQLException | IOException e) {
            System.out.println("Error en Ejercicio 3: " + e.getMessage());
        }
    }

    // 4. Insertar una nueva asignatura
    // Usamos executeUpdate para INSERT
    public void insertarAsignatura(String nombre, String aula, boolean obligatoria) {
        String sql = "INSERT INTO Asignatura (nombre, aula, obligatoria) VALUES (?, ?, ?)";

        try (Connection conn = Conexion.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombre);
            pstmt.setString(2, aula);
            pstmt.setBoolean(3, obligatoria);
            pstmt.executeUpdate();
            System.out.println("Asignatura '" + nombre + "' insertada correctamente.");

        } catch (SQLException | IOException e) {
            System.out.println("Error en Ejercicio 4: " + e.getMessage());
        }
    }

    // 5. Modificar el aula de una asignatura
    public void modificarAula(int idAsignatura, String nuevaAula) {
        // Fíjate que el ID se llama 'id_asignatura'
        String sql = "UPDATE Asignatura SET aula = ? WHERE id_asignatura = ?";

        try (Connection conn = Conexion.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nuevaAula);
            pstmt.setInt(2, idAsignatura);
            int filas = pstmt.executeUpdate();

            if (filas > 0) System.out.println("Aula actualizada al ID " + idAsignatura);
        } catch (SQLException | IOException e) {
            System.out.println("Error en Ejercicio 5: " + e.getMessage());
        }
    }

    // 6. Eliminar una asignatura
    public void eliminarAsignatura(String nombreAsignatura) {
        String sql = "DELETE FROM Asignatura WHERE nombre = ?";

        try (Connection conn = Conexion.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombreAsignatura);
            pstmt.executeUpdate();
            System.out.println("Asignatura '" + nombreAsignatura + "' eliminada.");
        } catch (SQLException | IOException e) { //catch del  try conectar
            System.out.println("Error en Ejercicio 6: " + e.getMessage());
        }
    }
}