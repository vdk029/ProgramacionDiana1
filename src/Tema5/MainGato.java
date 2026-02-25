package Tema5;

public class MainGato {
    public static void main(String[] args) {

        System.out.println("Gato válido");
        try {
            Gato g1 = new Gato("Dongato", 5);
            g1.imprimir();
            System.out.println("Gato creado correctamente");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        try {
            // Esto va a fallar porque nombre  tiene menos de 3 letras
            Gato g2 = new Gato("Do", 5);
            g2.imprimir();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        try {
            Gato g3 = new Gato("Dongato", -7);
            g3.imprimir();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        try {
            Gato g4 = new Gato("Dongato", 10);
            g4.imprimir();

            System.out.println("Cambiar edad");
            g4.setEdad(-5);

            System.out.println("Edad cambiada.");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
