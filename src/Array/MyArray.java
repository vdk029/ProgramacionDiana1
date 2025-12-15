package Array;

import java.util.Scanner;

public class MyArray {

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            System.out.println(array[i]);
        }
    }

    public static int maxArray(int[] array) {
        int numeroMaximo = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > numeroMaximo) {
                numeroMaximo = array[i];
            }
        }
        return numeroMaximo;
    }

    public static int minArray(int[] array) {
        int numeroMinimo = array[0];

        for (int numero : array) {
            if (numero < numeroMinimo) {
                numeroMinimo = numero;
            }
        }
        return numeroMinimo;
    }

    public static double media(int[] array) {
        int sumaTotal = 0;

        for (int numero : array) {
            sumaTotal += numero;
        }
        return (double) sumaTotal / array.length;
    }

    public static boolean existeArray(int[] array, int valorBuscado) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valorBuscado) {
                return true;
            }
        }
        return false;
    }


    public static int[] sumaArrays(int[] arrayA, int[] arrayB) {
        int[] arrayResultado = new int[arrayA.length];

        for (int i = 0; i < arrayA.length; i++) {
            arrayResultado[i] = arrayA[i] + arrayB[i];
        }
        return arrayResultado;
    }

    public static int[] restaArrays(int[] arrayA, int[] arrayB) {
        int[] arrayResultado = new int[arrayA.length];

        for (int i = 0; i < arrayA.length; i++) {
            arrayResultado[i] = arrayA[i] - arrayB[i];
        }
        return arrayResultado;
    }

    public static int productoEscalar(int[] arrayA, int[] arrayB) {
        int resultado = 0;

        for (int i = 0; i < arrayA.length; i++) {
            resultado += arrayA[i] * arrayB[i];
        }
        return resultado;
    }

    public static int[] invertirArray(int[] array) {
        int[] arrayInvertido = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayInvertido[i] = array[array.length - 1 - i];
        }
        return arrayInvertido;
    }
    public static int[] invertirInPlace(int[] array) {
        int izquierda = 0;
        int derecha = array.length - 1;

        while (izquierda < derecha) {
            int temporal = array[izquierda];
            array[izquierda] = array[derecha];
            array[derecha] = temporal;

            izquierda++;
            derecha--;
        }
        return array;
    }
    public static boolean esCapicua(int[] array) {
        int izquierda = 0;
        int derecha = array.length - 1;

        while (izquierda < derecha) {
            if (array[izquierda] != array[derecha]) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Arrays para almacenar los datos de los vectores
        int[] array1 = new int[0];
        int[] array2 = new int[0];

        int opcion;

        do {
            System.out.println("Menu");
            System.out.println("1 Introducir array 1");
            System.out.println("2 Introducir array 2");
            System.out.println("3 Mostrar array 1");
            System.out.println("4 Maximo array 1");
            System.out.println("5 Minimo array 1");
            System.out.println("6 Media array 1");
            System.out.println("7 Buscar número en array 1");
            System.out.println("8 Sumar arrays");
            System.out.println("9 Restar arrays");
            System.out.println("10 Producto escalar");
            System.out.println("11 Invertir array 1");
            System.out.println("12 Es capicua array 1?");
            System.out.println("0 Salir");
            System.out.print("Elige una opcion: ");

            opcion = input.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Tamaño del array 1: ");
                    array1 = new int[input.nextInt()];
                    System.out.println("Poner los valores:");
                    for (int i = 0; i < array1.length; i++) {
                        array1[i] = input.nextInt();
                    }
                    break;

                case 2:
                    System.out.print("Tamaño del array 2: ");
                    array2 = new int[input.nextInt()];
                    System.out.println("Poner los valores:");
                    for (int i = 0; i < array2.length; i++) {
                        array2[i] = input.nextInt();
                    }
                    break;

                case 3:
                    imprimirArray(array1);
                    break;

                case 4:
                    System.out.println("Maximo: " + maxArray(array1));
                    break;

                case 5:
                    System.out.println("Minimo: " + minArray(array1));
                    break;

                case 6:
                    System.out.println("Media: " + media(array1));
                    break;

                case 7:
                    System.out.print("Numero a buscar: ");
                    int numeroBuscado = input.nextInt();
                    System.out.println(existeArray(array1, numeroBuscado));
                    break;

                case 8:
                    imprimirArray(sumaArrays(array1, array2));
                    break;

                case 9:
                    imprimirArray(restaArrays(array1, array2));
                    break;

                case 10:
                    System.out.println("Producto escalar: " + productoEscalar(array1, array2));
                    break;

                case 11:
                    invertirInPlace(array1);
                    imprimirArray(array1);
                    break;

                case 12:
                    if (esCapicua(array1)) {
                        System.out.println("Es capicua");
                    } else {
                        System.out.println("No es capicua");
                    }
                    break;

                case 0:
                    System.out.println("Salir");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 0);

        input.close();
    }
}
