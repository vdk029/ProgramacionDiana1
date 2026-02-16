package POO;

public class Cuenta {
    private final int numeroCuenta;
    private double saldoDisponible;


    //Constructor
    public Cuenta(int numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldoDisponible = saldoInicial;
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
        System.out.println("has recibido"+cantidad+"de dinero"+this.saldoDisponible);
    }

    public void pagarRecibo(double cantidad) {
        this.saldoDisponible =this.saldoDisponible- cantidad;
        System.out.println("has pagado"+cantidad+"de dinero"+this.saldoDisponible);
    }
}