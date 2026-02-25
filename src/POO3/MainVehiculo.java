package POO3;

public class MainVehiculo {
    public static void main(String[] args) {
        //primero padre luego hijo
        Turismo coche = new Turismo("porche", "blano", "9999zzz", 2022, 5, "particular");
        Camion camion = new Camion("mercedes", "blano", "999zzz", 1989, 2, true);
        Ciclomotor moto = new Ciclomotor("vespa", "azul", "1234hvw", 2000, 129);

        //probamos herencia
        System.out.println("el coche es " + coche.getMarca() + "el camion es" + camion.getMarca() + "la moto es" + moto.getMarca());

        //Probar por defecto si se cambia el 10 de la cilindrada
        System.out.println("cilindrada de la moto real"+moto.getCilindrada());
        moto.necesitaCarnet();
    }
}
