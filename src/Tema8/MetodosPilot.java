package Tema8;

import java.sql.*;
import java.util.Scanner;

public class MetodosPilot {

    public static void menu() {
        System.out.println("\n1.Añadir 2.LeerUno 3.Todos 4.Actualizar 5.Eliminar 6.ClasifPilotos 7.ClasifEscuderias 0.Salir");
    }

    public static void addPilot(Scanner sc) {
        try {
            System.out.println("Código (Ej. ALO):");
            String code = sc.nextLine();

            System.out.println("Nombre:");
            String forename = sc.nextLine();

            System.out.println("Apellido:");
            String surname = sc.nextLine();

            System.out.println("Fecha Nacimiento (YYYY-MM-DD):");
            Date dob = Date.valueOf(sc.nextLine());

            System.out.println("Nacionalidad:");
            String nat = sc.nextLine();

            System.out.println("URL (o deja en blanco):");
            String url = sc.nextLine();

            Pilot nuevoPiloto = new Pilot(0, code, forename, surname, dob, nat, url);

            String sql = "INSERT INTO drivers (code, forename, surname, dob, nationality, url) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = DBConection.getConnection().prepareStatement(sql);

            ps.setString(1, nuevoPiloto.getCode());
            ps.setString(2, nuevoPiloto.getForename());
            ps.setString(3, nuevoPiloto.getSurname());
            ps.setDate(4, nuevoPiloto.getDob());
            ps.setString(5, nuevoPiloto.getNationality());
            ps.setString(6, nuevoPiloto.getUrl());

            ps.executeUpdate();
            System.out.println("Piloto guardado con éxito.");

        } catch (Exception e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

    public static void readUno(Scanner sc) {
        try {
            System.out.println("Dime el ID del piloto:");
            int id = sc.nextInt();
            if (sc.hasNextLine()) sc.nextLine();

            String sql = "SELECT * FROM drivers WHERE driverid = ?";
            PreparedStatement ps = DBConection.getConnection().prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("Piloto: " + rs.getString("forename") + " " + rs.getString("surname"));
            } else {
                System.out.println("Piloto no encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
    }

    public static void showTodos() {
        try {
            String sql = "SELECT * FROM drivers";
            ResultSet rs = DBConection.getConnection().createStatement().executeQuery(sql);

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("driverid") + " - " + rs.getString("forename") + " " + rs.getString("surname"));
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar: " + e.getMessage());
        }
    }

    public static void updatePilot(Scanner sc) {
        try {
            System.out.println("Dime el ID del piloto a actualizar:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Nuevo Codigo");
            String code = sc.nextLine();
            System.out.println("Nuevo Nombre:");
            String forename = sc.nextLine();
            System.out.println("Nuevo Apellido:");
            String surname = sc.nextLine();
            System.out.println("Nueva Fecha");
            Date dob = Date.valueOf(sc.nextLine());
            System.out.println("Nueva Nacionalidad:");
            String nat = sc.nextLine();
            System.out.println("Nueva URL:");
            String url = sc.nextLine();

            String sql = "UPDATE drivers SET code=?, forename=?, surname=?, dob=?, nationality=?, url=? WHERE driverid=?";
            PreparedStatement ps = DBConection.getConnection().prepareStatement(sql);

            ps.setString(1, code);
            ps.setString(2, forename);
            ps.setString(3, surname);
            ps.setDate(4, dob);
            ps.setString(5, nat);
            ps.setString(6, url);
            ps.setInt(7, id);

            int filas = ps.executeUpdate();
            if (filas > 0) System.out.println("Piloto actualizado.");
            else System.out.println("No se encontró el piloto.");
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
    }

    public static void deletePilot(Scanner sc) {
        try {
            System.out.println("Dime el ID del piloto a borrar:");
            int id = sc.nextInt();
            if (sc.hasNextLine()) sc.nextLine();

            String sql = "DELETE FROM drivers WHERE driverid = ?";
            PreparedStatement ps = DBConection.getConnection().prepareStatement(sql);
            ps.setInt(1, id);

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Piloto eliminado.");
            } else {
                System.out.println("No se ha encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Error al borrar" + e.getMessage());
        }
    }

    public static void showPilotClassification() {
        try {
            String sql = "SELECT d.forename, d.surname, SUM(r.points) as total FROM drivers d " +
                    "JOIN results r ON d.driverid = r.driverid GROUP BY d.driverid ORDER BY total DESC";
            ResultSet rs = DBConection.getConnection().createStatement().executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getString("forename") + " " + rs.getString("surname") + " - Puntos: " + rs.getInt("total"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void showBuildersClassification() {
        try {
            String sql = "SELECT c.name, SUM(r.points) as total FROM constructors c " +
                    "JOIN drivers d ON c.constructorid = d.constructorid " +
                    "JOIN results r ON d.driverid = r.driverid " +
                    "GROUP BY c.constructorid ORDER BY total DESC";
            ResultSet rs = DBConection.getConnection().createStatement().executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getString("name") + " - Puntos: " + rs.getInt("total"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}