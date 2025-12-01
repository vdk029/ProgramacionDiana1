package Tema3M1;

/// void procedimiento si es vacio si tiene parametros es metodo.
/// investigar sobre nombre de parametro ejemplo arr y int arr.

public class pruebaArray {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);}
    }

    public static void main(String[] args) {

        int[] arr = new int[]{0, 2, 4, 6, 8, 10, 12, 14, 16, 18};
    }
}
