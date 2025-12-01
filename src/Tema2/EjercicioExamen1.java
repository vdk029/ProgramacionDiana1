package Tema2;

import java.util.Scanner;

public class EjercicioExamen1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("menu opciones a,b o c escoge una opcion.");
        String menu = input.next();
        int aprobados = 0;
        int suspendidos = 0;
        int notas = 0;

        int familiares = 0;
        int edad = 0;
        double normal = 32;
        double jubilado = 32 * 0.10;
        double adolescente = 32 * 0.08;
        double kid = 32 * 0.35;
        double bebe = 0;
        double total = familiares * normal;

        switch (menu) {
            case "a":
                System.out.println("Aprobados y suspendidos");
                System.out.println("¿Cuantas notas hay?");
                int n = input.nextInt();// numero de notas
                for (int i = 0; i <= notas; i++) {
                    System.out.println("dime la puntuacion de esas notas");
                    notas = input.nextInt();
                    if (notas < 0 || notas > 11) {
                        System.out.println("nota invalida, pon las notas de nuevo");
                    } else if (notas < 5) {
                        suspendidos++;

                    } else {
                        aprobados++;
                    }
                    System.out.println("hay " + suspendidos + " suspendidos y " + aprobados + "aprobados");
                }
                break;
            case "b":
                System.out.println("Tarifas de tren:" +
                        "Jubilados +65 años descuento 10%" +
                        "adolescentes de 12 a 15 años 8%" +
                        "niños de 4 a 11 años 35%" +
                        "bebes entran gratis");

                System.out.println("¿Cuantos familiares hay?");
                familiares = input.nextInt();
                for (int i = 1; i <= familiares; i++) {
                    System.out.println("Cual es el nombre de los familiares ");
                    String nombre = input.next();

                    System.out.println("Cual es la edad de cada familiar?");
                    edad = input.nextInt();
                    if (edad > 65) {
                        jubilado = normal - jubilado;
                        System.out.println(nombre + "tiene descuento y paga" + jubilado);
                    } else if (edad >= 12 && edad < 15) {
                        adolescente = normal - adolescente;
                        System.out.println(nombre + "tiene descuento y paga " + adolescente);
                    } else if (edad > 4 && edad <= 11) {
                        kid = normal - kid;
                        System.out.println(nombre + "tiene descuento y paga " + kid);
                    } else if (edad > 0 && edad <= 4) {
                        bebe = normal * bebe;
                        System.out.println(nombre + "tiene descuento y paga" + bebe);
                    } else if (edad < 0) {
                        System.out.println("edad no valida ponla de nuevo");
                    } else {
                        System.out.println("paga la tarifa normal" + normal);
                    }break;
                }
            case "c":
                System.out.println("Salir del menu. Adios");
                break;
            default:
                System.out.println("la opcion introducida no es valida,pon la letra correcta");

        }

    }
}
