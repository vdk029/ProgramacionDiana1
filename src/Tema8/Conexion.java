package Tema8;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {
    // ESTO ES LO QUE NECESITA OPERACIONES
    public static Connection conectar() throws SQLException, IOException {
        Properties props = new Properties();
        // Usa la ruta que ya sabemos que te funciona
        try (FileInputStream fis = new FileInputStream("C:\\Users\\VOSKI\\IdeaProjects\\ProgramacionDiana1\\src\\Tema8\\db.properties")) {
            props.load(fis);
            return DriverManager.getConnection(
                    props.getProperty("db.url"),
                    props.getProperty("db.user"),
                    props.getProperty("db.password")
            );
        }
    }

    public static void main(String[] args) {
        try (Connection conn = conectar()) {
            if (conn != null) System.out.println("¡Siuuu! Funcionando");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}