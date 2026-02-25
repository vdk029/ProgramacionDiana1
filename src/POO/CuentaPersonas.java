package POO;

class CuentaPersonas {
    private final String dni;
    private Cuenta[] cuentas;
    private int cuentasActuales;
    public static final String DNI_BASE = "266000831C";
    public static final int CUENTAS_BASE = 1234;


    //constructores
    public CuentaPersonas(String dni) {
        this.dni = dni;
        //me lo apunto como hcaer el array en contrcutor vacio
        this.cuentas = new Cuenta[3];
        this.cuentasActuales = 0;
    }

    //Constructor vacio
    public CuentaPersonas() {
        this.dni = DNI_BASE;
        this.cuentasActuales = CUENTAS_BASE;
    }

    //Getters & Setters
    public String getDni() {
        return this.dni;
    }

    // Para poder ver las cuentas desde el Main
    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public int getCuentasActuales() {
        return cuentasActuales;
    }

    public boolean addCuenta(Cuenta nuevaCuenta) {
        boolean anyadido = false;
        if (cuentasActuales < 3) {
            cuentas[cuentasActuales++] = nuevaCuenta;
            System.out.println("Cuenta nueva" + nuevaCuenta.getNumeroCuenta() + "creada con dni" + dni);
            anyadido = true;
        } else {
            System.out.println("No se pueden añadir mas cuentas a " + dni);
            anyadido = false;
        }
        return anyadido;
    }


    public boolean esMorosa() {
        boolean moroso = true;
        for (int i = 0; i < cuentasActuales; i++) {
            if (cuentas[i].getSaldoDisponible() < 0)
                System.out.println("Es moroso");
            moroso = true;

            System.out.println("No es moroso");
            moroso = false;
        }

        return moroso;
    }
}
    //@Override
    //public String toString()



