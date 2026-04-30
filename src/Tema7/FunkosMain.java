package Tema7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunkosMain {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funko> listaFunkos = new ArrayList();
        FunkosMetodos funkosMetodos = new FunkosMetodos();

        try {
            funkosMetodos.loadFunkos(listaFunkos);
        } catch (IOException e) {
            System.out.println("Error no se ha cargado el archivo "+e.getMessage());
        }
        int opcion;
        do {
            System.out.println("1 Crear funko");
            System.out.println("2 Eliminar Funko ");
            System.out.println("3 Ver media");
            System.out.println("4 Ver el Funko mas  caro");
            System.out.println("5 Ver Funkos de 2023");
            System.out.println("0 Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 0:
                    System.out.println("salir");
                    break;
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Precio: ");
                    String precio = sc.nextLine();
                    System.out.print("Fecha (aaaa-mm-dd): ");
                    String fechaLanzamiento = sc.nextLine();
                    int cod = listaFunkos.size();
                    String codigo = "ID" + (cod + 1);
                    String lineaFabricada = codigo + "," + nombre + "," + modelo + "," + precio + "," + fechaLanzamiento;
                    funkosMetodos.crearFunkos(lineaFabricada, listaFunkos);
                    funkosMetodos.saveFunkos(listaFunkos);
                case 2:
                    System.out.print("Introduce el codigo ID para borrar: ");
                    String codBorrar = sc.nextLine();
                    funkosMetodos.eliminarFunkos(codBorrar, listaFunkos);
                    break;
                case 3:
                    funkosMetodos.mediaFunkos(listaFunkos);
                    break;
                case 4:
                    funkosMetodos.masCaro(listaFunkos);
                    break;
                case 5:
                    funkosMetodos.filtroYear(listaFunkos);
                    break;
                default:
                    System.out.println("Opcion no valida prueba otra vez ");
            }
        } while(opcion != 0);
    }
}
