package POO;

public class Personas {
    // ATRIBUTOS
    // FINAL PORQUE DNU NOSE PUEDE CAMBIAR
    private final String dni;
    private String name;
    private String surname;
    private int age;
    public static final int ADULT_AGE = 18;
    public static final int RETIRED_AGE = 65;

    // CONSTRUCTOR
    public Personas(String dni, String name, String surname, int age) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // GETTERS & SETTERS
    public String getDni() {
        return dni;
    }
    // no ponemos el dni porque es finalñ

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // MeTODOS

    public void print() {
        System.out.println("Datos: " + name + " " + surname + ", DNI: " + dni + ", Edad: " + age);
    }

    //saber si es adulto
    public boolean isAdult() {
        if (this.age == ADULT_AGE) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isRetired() {
        if (this.age >= RETIRED_AGE) {
            return true;
        } else {
            return false;
        }
    }

    public int ageDifference(Personas otraPersona) {
        int diferencia = this.age - otraPersona.getAge();
        return diferencia;
    }

    public static boolean checkDNI(String dni) {
        //que tenga longitud 9
        if (dni.length() == 9) {
            return true;
        } else {
            return false;
        }
    }
}

