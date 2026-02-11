package POO;

import java.util.Scanner;
//numero de cuenta y saldo disponible. atributos solo esos creamos la variable en los parametros de los metodos
public class Cuenta {
    private final int numeroCuenta;
    private double saldoDisponible;

    //Constructores
    public Cuenta(int numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldoDisponible = saldoInicial;
    }
    //Constructores vacios.


    //Getters & Setters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    //atributo final solo usa get

    //Consultar saldo disponible, recibir abonos y pagar recibos
    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    //Como hacen cosas hacemos un metodo directamente no getter ni setter ademas creamos la variable en el parametro.
    public void recibirAbono(double cantidad) {
        saldoDisponible = saldoDisponible + cantidad;
    }

    public void pagarRecibo(double cantidad) {
        saldoDisponible = saldoDisponible - cantidad;
    }
}



//Creo una  nueva clase porque clase persona aqui tiene atributos diferentes
public class Persona {
    //Mirar si lo validamos tambien el dni
    private final String dni;
    //asociamos el id de cuenta o las cuentas que tiene a persona numeroCuenta
    private Cuenta[] cuentas;
    //array de las cuentas que tiene con los id numeroCuenta
    private int cuentasActuales;


    //Constructores
    public Persona(String dni) {
        this.dni = dni;
        this.cuentas = new Cuenta[3];
        this.cuentasActuales = 0;
    }
    //Contructores vacios

    //Getter & Setters
    public String getDni() {
        return dni;
    }

    public boolean añadirCuenta(Cuenta nuevaCuenta) {
        if (cuentasActuales < 3) {
            cuentas[cuentasActuales++] = nuevaCuenta;
            return true;
        }
        return false;
    }


    //Metodo
    public boolean esMorosa() {
        for (int i = 0; i < cuentasActuales; i++) {
            if (cuentas[i].getSaldo() <= 0) return true;
        }
        return false;
    }
    //Metodo

    public boolean tieneCuentas() {
        return cuentasActuales > 0;
    }

    //Metodo
    public Cuenta getCuentaSeguro(String numeroCuenta) {
        for (int i = 0; i < cuentasActuales; i++) {
            if (cuentas[i].getNumeroCuenta().equals(numeroCuenta)) return cuentas[i];
        }
        // Devuelve una cuenta "dummy" si no existe
        return new Cuenta("invalida", 0);
    }

//Mostrar datos con dni seria pedirle al usario que introduzca
// el dni y de ahi printear la variable asociada de la cuenta investigarlo
    //Printear personas morosas ya sabeos que es un for
    //Main

    public class PruebaCuentas {
        static Personas[] listaPersonas = new Personas[10];
        static int contadorPersonas = 0;
        static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            int opcion;
            do {
                System.out.println("1. Crear Persona\n2. Añadir Cuenta\n3. Mostrar Datos\n4. Nómina\n5. Pago\n6. Transferencia\n7. Morosos\n0. Salir");
                opcion = input.nextInt();
                input.nextLine();
                switch (opcion) {
                    case 1 -> crearPersona();
                    case 2 -> asociarCuenta();
                    case 3 -> mostrarPersona();
                    case 4 -> gestionarDinero(true);
                    case 5 -> gestionarDinero(false);
                    case 6 -> transferencia();
                    case 7 -> listarMorosos();
                }
            } while (opcion != 0);
        }


        //Esto esta mal no se hace asi en el main solo mostramos eso va arriba en metedos de persona
        public static void crearPersona() {
            if (contadorPersonas < listaPersonas.length) {
                System.out.print("Dime el DNI: ");
                String dni = input.nextLine();
                listaPersonas[contadorPersonas++] = new Personas(dni);
                System.out.println("Persona creada correctamente.");
            } else {
                System.out.println("No hay espacio para más personas.");
            }
        }

        public static Personas buscarPersona() {
            System.out.print("DNI de la persona: ");
            String dni = input.nextLine();
            for (int i = 0; i < contadorPersonas; i++) {
                if (listaPersonas[i].getDni().equals(dni)) return listaPersonas[i];
            }
            System.out.println("Persona no encontrada.");
            return new Personas("invalido"); // retorno seguro sin null
        }

        public static void gestionarDinero(boolean esAbono) {
            Personas persona = buscarPersona();
            if (!persona.tieneCuentas()) {
                System.out.println("No tiene cuentas disponibles.");
                return;
            }

            System.out.print("Número de cuenta: ");
            String numero = input.nextLine();
            Cuenta cuenta = persona.getCuentaSeguro(numero);

            if (cuenta.getNumeroCuenta().equals("invalida")) {
                System.out.println("Cuenta no encontrada.");
                return;
            }

            System.out.print("Cantidad: ");
            double cantidad = input.nextDouble();
            input.nextLine(); // limpiar buffer

            if (esAbono) {
                cuenta.recibirAbono(cantidad);
            } else {
                cuenta.pagarRecibo(cantidad);
            }

            System.out.println("Operación realizada.");
        }

        public static void listarMorosos() {
            System.out.println("Personas morosas:");
            for (int i = 0; i < contadorPersonas; i++) {
                if (listaPersonas[i].esMorosa()) {
                    System.out.println("DNI: " + listaPersonas[i].getDni());
                }
            }
        }


        // Métodos de ejemplo para completar
        public static void asociarCuenta() {
        }

        public static void mostrarPersona() {
        }

        public static void transferencia() {
        }
    }
}

