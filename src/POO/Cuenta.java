package POO;

public class Cuenta {
    private final int numeroCuenta;
    private double saldoDisponible;
    public static final int  NUMERO_CUENTA_BASE=1234;
    public static final double SALDO_DISPONIBLE_BASE=129.9;




    //Constructor
    public Cuenta(int numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldoDisponible = saldoInicial;
    }
    public Cuenta(){
     this.numeroCuenta=NUMERO_CUENTA_BASE;
     this.saldoDisponible=SALDO_DISPONIBLE_BASE;
    }




    public int getNumeroCuenta() {
        return this.numeroCuenta;

    }

    public double getSaldoDisponible() {
        return this.saldoDisponible;
    }


    //Metodos
    public void recibirAbono(double cantidad) {
        this.saldoDisponible = this.saldoDisponible + cantidad;
        System.out.println("has recibido" + cantidad + "de dinero" + this.saldoDisponible);
    }

    public void pagarRecibo(double cantidad) {
        this.saldoDisponible = this.saldoDisponible - cantidad;
        System.out.println("has pagado" + cantidad + "de dinero" + this.saldoDisponible);
    }

    @Override
    public String toString() {
        return "Cuenta " + numeroCuenta + "Saldo" + saldoDisponible;
    }
}