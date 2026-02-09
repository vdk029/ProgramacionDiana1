package POO;

    import java.util.Random;

    public class Hero {
        private static final int INICIAL_HEALTH = 100;
        private static final int INICIAL_ATTACK = 20;
        private static final int INICIAL_DEFENSE = 10;
        private static final int INICIAL_LEVEL = 1;
        private static final int INICIAL_EXPERIENCE = 0;
        private static final int INICIAL_MAX_VIDA = 100;
        private static final int TOMAR_POCION = 10;
        private static final int REST_HEAL = 50;

        private String name;
        private int health;
        private int attack;
        private int defense;
        private int level;
        private int maxVida;
        private int experience;

        public Hero() {
            this.name = "Pepe";
            this.health = INICIAL_HEALTH;
            this.attack = INICIAL_ATTACK;
            this.defense = INICIAL_DEFENSE;
            this.level = INICIAL_LEVEL;
            this.maxVida = INICIAL_MAX_VIDA;
            this.experience = INICIAL_EXPERIENCE;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = Math.min(health, getMaxVida());
        }

        public int getAttack() {
            return attack;
        }

        public void setAttack(int attack) {
            this.attack = attack;
        }

        public int getDefense() {
            return defense;
        }

        public void setDefense(int defense) {
            this.defense = defense;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public int getMaxVida() {
            return maxVida;
        }

        public void setMaxVida(int maxVida) {
            this.maxVida = maxVida;
        }

        public int getExperience() {
            return experience;
        }

        public void setExperience(int experience) {
            this.experience = experience;
            subirNivel();
        }

        public void subirNivel() {
            while (getExperience() >= getLevel() * 100) {
                setLevel(getLevel() + 1);
                setExperience(getExperience() - (getLevel() - 1) * 100);
                setMaxVida(getMaxVida() + 20);
                setHealth(getMaxVida());
                setAttack(getAttack() + 5);
                setDefense(getDefense() + 2);
                System.out.println(getName() + " ha subido al nivel " + getLevel() + "!");
            }
        }

        public void drinkPotion() {
            setHealth(getHealth() + TOMAR_POCION);
            System.out.println(getName() + " ha tomado la pocion  y tiene " + getHealth() + "/" + getMaxVida());
        }

        public void ganarExperience(int puntos) {
            setExperience(getExperience() + puntos);
            System.out.println(getName() + " ha ganado " + puntos + " puntos de experiencia.");
        }

        public void rest() {
            setHealth(getHealth() + REST_HEAL);
            System.out.println(getName() + " se ha curado ahroa tiene vida  " + getHealth() + "/" + getMaxVida());
        }

        public void mostrarInformacion() {
            System.out.println("Nombre: " + getName());
            System.out.println("Nivel: " + getLevel());
            System.out.println("Vida: " + getHealth() + "/" + getMaxVida());
            System.out.println("Ataque: " + getAttack());
            System.out.println("Defensa: " + getDefense());
            System.out.println("Experiencia: " + getExperience());
        }

        public void attack(Hero enemigo) {
            Random aleatorio = new Random();
            int damage = aleatorio.nextInt(getAttack());
            int danioReal = damage - enemigo.getDefense();

            enemigo.setHealth(enemigo.getHealth() - danioReal);
            System.out.println(getName() + " ataca a " + enemigo.getName() + " y le quita " + danioReal + " de vida.");
        }

        public String heroInfo() {
            return "el heroe " + getName() + " esta en nivel " + getLevel() + " con vida " + getHealth() + "/" + getMaxVida() +
                    ", ataque " + getAttack() + ", defensa " + getDefense() + " y experiencia " + getExperience();
        }

        public static void main(String[] args) {
            Hero hero1 = new Hero();
            Hero hero2 = new Hero();
            hero2.setName("Carlos");

            hero1.mostrarInformacion();
            hero2.mostrarInformacion();

            hero1.ganarExperience(250);
            hero1.mostrarInformacion();

            hero1.drinkPotion();
            hero1.rest();

            hero1.attack(hero2);
            hero2.mostrarInformacion();
        }
    }

