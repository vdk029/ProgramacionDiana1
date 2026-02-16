package POO;

import java.util.Random;

public class Hero {
    // ATRIBUTOS
    final private String name;
    private int level;
    private int health;
    private int maxHealth;
    private int experience;
    private int attack;
    private int defense;

    private static final int POTION_HEAL = 10;
    private static final int REST_HEAL = 50;
    private static final int EXP_PER_ATTACK = 10;
    private static final int EXP_TO_LEVEL_UP = 50;
    private static final int LEVEL_UP_HEALTH = 5;
    private static final int LEVEL_UP_ATTACK = 1;
    private static final int LEVEL_UP_DEFENSE = 1;

    Random random = new Random();

    // CONSTRUCTOR
    public Hero(String name, int health, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.attack = attack;
        this.defense = defense;
        this.level = 1;
        this.experience = 0;
    }

    // GETTERS & SETTERS
    public String getName() {

        return this.name;
    }
    // setName no cambia el nombre es final

    public int getLevel() {
        return this.level;
    }

    //setLevel metodo LevelUp
    public int getHealth() {

        return this.health;
    }

    public void setHealth(int health) {
        if (health > maxHealth) {
            this.health = maxHealth;
        } else if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    public int getDefense() {
        return this.defense;
    }
    // setDefense metodo LevelUp

    public int getAttack() {
        return this.attack;
    }
    //setAttack metodo atack


    // METodos

    public void drinkPotion() {
        this.setHealth(this.health + POTION_HEAL);
        System.out.println(this.name + " bebe una pocion y la Vida actual es " + this.health);
    }

    public void rest() {
        this.setHealth(this.health + REST_HEAL);
        System.out.println(this.name + " descansa. Vida actual: " + this.health);
    }

    public void attack(Hero enemigo) {
        int danio = Math.max(this.attack - this.defense, 10);


        enemigo.setHealth(enemigo.getHealth() - danio);
        System.out.println(this.name + " ataca a " + enemigo.getName() + " y hace " + danio + " de daño.");

        enemigo.setHealth(enemigo.getHealth() - danio);

        this.experience += EXP_PER_ATTACK;

    }

    public void levelUp() {
        this.level++;
        this.maxHealth += LEVEL_UP_HEALTH;
        this.attack += LEVEL_UP_ATTACK;
        this.defense += LEVEL_UP_DEFENSE;
        this.health = maxHealth;
        System.out.println(this.name + " ha subido a nivel " + this.level);
    }

    @Override
    public String toString() {
        return "Nombre: " + name + "Nivel: " + level + "Vida: " + health + "/" + maxHealth + "Ataque: " + attack + "Defensa: " + defense + "Experiencia: " + experience;
    }
}
