
package POO;


public class Reloj {
    //Atributos
    private int hour;
    private int min;
    private int sec;
    private boolean formato24h;

    //Constructor vacio es sin parametro!!!!
    public Reloj() {
        int hour = 0;
        int min = 0;
        int sec = 0;
        boolean formato24h = true;

    }
    //Constructor con parametro.
    public Reloj(int hour, int min, int sec, boolean formato24h) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        this.formato24h = formato24h;
    }
    //Fin Constructores.

    //Getters & Setters
    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            System.out.println("hora invalida");
        } else this.hour = hour;
    }

    public int getmin() {
        return this.min;
    }

    public void setMin(int min) {
        if (min < 0 || min >= 60) {
            System.out.println("Minutos invalidos");
        } else this.min = min;
    }

    public int getSec() {
        return this.sec;
    }

    public void setSec(int sec) {
        if (sec < 0 || sec >= 60) {
            System.out.println("Segundos invalidos");
        } else this.sec = sec;
    }

    public boolean getFormato24() {
        return this.formato24h;
    }

    public void setFormato24h(boolean formato24h) {
        this.formato24h = formato24h;
    }

    //Metodos
    public void showHour() {
        if (this.formato24h) {
            System.out.println(" hora:" + hour + " minutos: " + min + "segundos:" + sec);
        } else if (this.hour > 12) {
            System.out.println(" hora:" + hour + -12 + " minutos: " + min + "segundos:" + sec + "PM");
        } else System.out.println(" hora:" + hour + " minutos: " + min + "segundos:" + sec + "AM");
    }

    @Override
    public String toString() {
        if (!formato24h) {
            return this.hour + ":" + this.min + ":" + this.sec + " Formato24h";
        } else if (hour > 12) {
            return this.hour - 12 + ":" + this.min + ":" + this.sec + " PM";
        } else return this.hour + ":" + this.min + ":" + this.sec + " AM";

    }
}


