package POO;

public class RelojMain {
    public static void main(String[] args) {
        Reloj reloj = new Reloj(14, 22, 55, true);
        reloj.setHour(25);
        System.out.println(reloj);
        reloj.showHour();
    }
}
