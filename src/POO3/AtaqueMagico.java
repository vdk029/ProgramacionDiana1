package POO3;

public class AtaqueMagico implements AtaqueAvanzado {
    private int ataque;
    private int danyo;
    private int mana;

    private int BASE_ATAQUE = 10;
    private int BASE_DABYO = 10;
    private int BASE_MANA = 10;

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDanyo() {
        return danyo;
    }

    public void setDanyo(int danyo) {
        this.danyo = danyo;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public int lanzar() {
        System.out.println("has lanzado un ataque" + this.ataque);
        return this.ataque;
    }

    @Override
    public int coste() {
        this.danyo = this.ataque + this.mana;
        System.out.println("haces danyo" + this.danyo);
        return this.danyo;
    }

    @Override
    public int danyoInfligido() {

        System.out.println("le has quitado de vida ataque-danyo = vida actual");
        return this.danyo;
    }

    @Override
    public void danyoUnido() {
        System.out.println("LAnzando ataque mixto FIsico + magico");
    }

    @Override
    public String toString() {
        return "AtaqueMagico{" +
                "ataque=" + ataque +
                ", danyo=" + danyo +
                ", mana=" + mana +
                '}';
    }
}

