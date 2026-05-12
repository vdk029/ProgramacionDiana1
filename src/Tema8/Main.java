package Tema8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            MetodosPilot.menu();
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                MetodosPilot.addPilot(sc);
            }
            else if (opcion == 2) {
                MetodosPilot.readUno(sc);
            }
            else if (opcion == 3) {
                MetodosPilot.showTodos();
            }
            else if (opcion == 4) {
                MetodosPilot.updatePilot(sc);
            }
            else if (opcion == 5) {
                MetodosPilot.deletePilot(sc);
            }
            else if (opcion == 6) {
                MetodosPilot.showPilotClassification();
            }
            else if (opcion == 7) {
                MetodosPilot.showBuildersClassification();
            }
            else if (opcion == 0) {
                System.out.println("Saliendo");
            }
            else {
                System.out.println("error ");
            }

        } while (opcion != 0);

        sc.close();
    }
}