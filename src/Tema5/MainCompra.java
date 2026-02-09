package POO;

import java.util.Scanner;

public class MainCompra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ListaCompra miLista = new ListaCompra();
        int add = 1;
        System.out.println("Lista de la comrpa");
        while (add != 0) {
            String producto = input.nextLine();
            if (miLista.addProducto(producto)) {
                System.out.println("Si add");
            } else {
                System.out.println("No add ");
            }
            System.out.println(" Para Salir escribe  0 o add mas productos :1");
            add = input.nextInt();
            input.nextLine();
        }
        System.out.println("esto es lo que hay n la lista" + miLista.getProductos());
    }
}
