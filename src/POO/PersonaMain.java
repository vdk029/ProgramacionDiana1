package POO;

import java.util.Scanner;

public class PersonaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //p1
        System.out.println("Introduce datos para la Persona 1");
        System.out.print("DNI: ");
        String dni1 = input.nextLine();

        if (Personas.checkDNI(dni1)) {
            System.out.println("(DNI valido)");
        } else {
            System.out.println("(DNI incorrecto)");
        }

        System.out.print("Nombre: ");
        String nom1 = input.nextLine();
        System.out.print("Apellido: ");
        String ape1 = input.nextLine();
        System.out.print("Edad: ");
        int edad1 = input.nextInt();


        Personas p1 = new Personas(dni1, nom1, ape1, edad1);


        // p2
        System.out.println("Introduce datos para la Persona 2 ");
        System.out.print("DNI: ");
        String dni2 = input.nextLine();
        System.out.print("Nombre: ");
        String nom2 = input.nextLine();
        System.out.print("Apellido: ");
        String ape2 = input.nextLine();
        System.out.print("Edad: ");
        int edad2 = input.nextInt();


        //p1 ya esta creado
        Personas p2 = new Personas(dni2, nom2, ape2, edad2);



        System.out.println("resultados");


        System.out.println("Nombre" + p1.getName() + " Edad" + p1.getAge() + " DNI" + p1.getDni());
        System.out.println("Nombre" + p2.getName() + " Edad" + p2.getAge() + " DNI " + p2.getDni());

        System.out.println("Es mayor de edad " + p1.getName()  + p1.isAdult());

        if (p2.isRetired()) {
            System.out.println(p2.getName() + " si esta jubilado.");
        } else {
            System.out.println(p2.getName() + " no esta jubilado");
        }

        System.out.println("Diferencia de edad: " + p1.ageDifference(p2) + " años.");
    }
}