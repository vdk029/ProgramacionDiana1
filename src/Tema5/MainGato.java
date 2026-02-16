package Tema5;

public class MainGato {
    public static void main(String[] args) {

        System.out.println("--- PRUEBA 1: Gato válido ---");
        try {
            Gato g1 = new Gato("Garfield", 5);
            g1.imprimir();
            System.out.println(">> Gato creado correctamente.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- PRUEBA 2: Nombre muy corto ---");
        try {
            // Esto va a fallar porque "Bo" tiene menos de 3 letras
            Gato g2 = new Gato("Bo", 2);
            g2.imprimir(); // Esta línea no llegará a ejecutarse
        } catch (Exception e) {
            System.out.println("¡Cazado! " + e.getMessage());
        }

        System.out.println("\n--- PRUEBA 3: Edad negativa ---");
        try {
            Gato g3 = new Gato("Felix", -7);
            g3.imprimir();
        } catch (Exception e) {
            System.out.println("¡Cazado! " + e.getMessage());
        }

        System.out.println("\n--- PRUEBA 4: Modificar (Setter) incorrecto ---");
        try {
            Gato g4 = new Gato("Isidoro", 10);
            g4.imprimir();

            System.out.println("Intentando cambiar edad a -5...");
            g4.setEdad(-5); // Aquí saltará la excepción

            System.out.println("Edad cambiada."); // No se imprime
        } catch (Exception e) {
            System.out.println("¡Cazado al usar el Setter! " + e.getMessage());
        }
    }
}
