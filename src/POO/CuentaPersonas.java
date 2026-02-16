package POO;

class CuentaPersonas {
    private final String dni;
    private Cuenta[] cuentas;
    private int cuentasActuales;

    //constructores
    public CuentaPersonas(String dni) {
        this.dni = dni;
        this.cuentas = new Cuenta[3];
        this.cuentasActuales = 0;
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
        if (cuentasActuales < 3) {
            cuentas[cuentasActuales++] = nuevaCuenta;
            System.out.println("Cuenta nueva" + nuevaCuenta.getNumeroCuenta() + "creada con dni" + dni);
            return true;
        } else {
            System.out.println("No se pueden añadir mas cuentas a " + dni);
        }
        return false;
    }

    public boolean esMorosa() {
        for (int i = 0; i < cuentasActuales; i++) {
            if (cuentas[i].getSaldoDisponible() < 0)
                System.out.println("Es moroso");
                return true;
        }
        System.out.println("No es moroso");
        return false;
    }
    public int buscarIndiceCuenta(int numeroBuscado) {
        for (int i = 0; i < cuentasActuales; i++) {
            if (cuentas[i].getNumeroCuenta() == numeroBuscado) {
                //return i que es la posicion de la cuenta
                return i;
            }
        }
        return -1;
    }
}