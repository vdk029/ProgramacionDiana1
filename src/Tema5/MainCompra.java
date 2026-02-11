package Tema5;

import java.util.Scanner;

public class MainCompra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ListaCompra miLista = new ListaCompra();
        int opcion =11;

        System.out.println("list ade la compra");

        while (opcion != 0) {
            System.out.println("" +
                    "1 Añadir producto " +
                    " 2 Meter al carro " +
                    " 3 Ver qué falta " +
                    " 0 Salir");
            System.out.print("Elige");
            opcion = input.nextInt();
            input.nextLine(); // Limpiar el intro

            switch (opcion) {
                case 1:
                    System.out.print("Producto: ");
                    String p = input.nextLine();
                    if (miLista.addProducto(p)) {
                        System.out.println("metido en la lsita");
                    } else {
                        System.out.println("ya estaba metido ");
                    }
                    break;
                case 2:
                    System.out.print("Meter en el carro?");
                    String pc = input.nextLine();
                    if (miLista.meterEnCarro(pc)) {
                        System.out.println("añadido");
                    } else {
                        System.out.println("no esta en la lista");
                    }
                    break;
                case 3:
                    miLista.falta();
                    break;
            }
        }
        System.out.println("Final: " + miLista.getProductos());
    }
}