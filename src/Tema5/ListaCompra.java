package Tema5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class ListaCompra {
    public static void mostrarmenu1() {
        System.out.println("1 Añadir producto a la lista de la compra");
        System.out.println("2 Eliminar producto de la lista de la compra");
        System.out.println("3 Mostrar lista de la compra");
        System.out.println("4 Añadir producto al carro");
        System.out.println("5 productos faltantes");
        System.out.println("6 Salir");
        System.out.print("Elige opcion: ");
    }

    public static void main(String[] args) {
        Set<String> compra = new HashSet<>();
        Set<String> carrito = new HashSet<>();
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        do {
            mostrarmenu1();
            opcion = input.nextInt();
            input.nextLine();


            switch (opcion) {
                case 1:
                    System.out.print("DIme el objeto de la compra: ");
                    String nuevo = input.nextLine();
                    if (!compra.add(nuevo)) {
                        System.out.println("Ya esta en la lista.");
                    } else {
                        System.out.println("Producto añadido");
                    }
                    break;

                case 2:
                    System.out.print("objeto que quieras eliminar: ");
                    String eliminar = input.nextLine();
                    if (compra.remove(eliminar)) {
                        System.out.println("Producto eliminado correctamente.");
                    } else {
                        System.out.println("El producto no estaba en la lista.");
                    }
                    break;

                case 3:
                    System.out.println("Lista de la compra (" + compra.size() + " productos):");
                    for (String a : compra) {
                        System.out.println("- " + a);
                    }
                    break;

                case 4:
                    System.out.print("Introduce el producto a añadir al carrito: ");
                    String enCarrito = input.nextLine().toLowerCase();
                    if (!carrito.add(enCarrito)) {
                        System.out.println("Ya esta en el carrito ");
                    } else {
                        System.out.println("Producto añadido al carrito correctamente.");
                    }
                    break;

                case 5:
                    Set<String> faltantes = new HashSet<>(compra);
                    faltantes.removeAll(carrito);
                    System.out.println("Productos faltantes:");
                    for (String faltan : faltantes) {
                        System.out.println("- " + faltan);
                    }
                    break;

                case 6:
                    System.out.println("adios");
                    break;

                default:
                    System.out.println("opcion incorrecta");
            }
        } while (opcion != 6);


    }

}

