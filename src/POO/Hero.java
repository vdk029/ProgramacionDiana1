package POO;

import java.util.Random;

public class Hero {
    // ATRIBUTOS
    private String name;
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
        return name;
    }

    public int getHealth() {
        return health;
    }


    public void setHealth(int health) {
        if (health > this.maxHealth) {
            this.health = this.maxHealth;
        } else if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

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
        int danio = Math.max(this.attack - enemigo.getDefense(), 10);


        enemigo.setHealth(enemigo.getHealth() - danio);
        System.out.println(this.name + " ataca a " + enemigo.getName() + " y hace " + danio + " de daño.");


        this.experience += EXP_PER_ATTACK;

    }
}