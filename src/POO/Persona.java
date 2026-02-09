package POO;

public class Persona {
    //Atributos
    private final String dni;
    private String name;
    private String surname;
    private int age;
    private final static int adultAge = 18;
    private final static int retiredAge = 65;


    //COnstructor vacio
    public Persona(){
        this.dni=dniBase
    }
    //Constructor con parametros.
    public Persona(String dni, String name, String surname, int age) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //Getters & Setters
    //DNI
    public String getDni() {
        return this.dni;
    }
    // SI el atributo es final no se usa set solo get.
    // FIN DNI

    //NAME
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //FIN NAME

    //SURNAME
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    //FIN SURNAME

    //AGE
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //FIN AGE


    //METODOS

    public void showData() {
        System.out.println("DNI: " + getDni());
        System.out.println("Nombre: " + getName());
        System.out.println("Apellido: " + getSurname());
        System.out.println("Edad: " + getAge());
    }

    public void isAdult(int age) {
        if (this.age >= 18) {
            System.out.println("es mayor de edad");
        } else {
            System.out.println("Es menor de edad ");
        }
    }

    public void isRetired(int age) {
        if (this.age >= 65) {
            System.out.println("Persona jubilada");
        } else {
            System.out.println("persona no jubilada");
        }
    }

    public int ageDiference(Persona persona2) {
        int edadDif = this.age - persona2.age;
        return edadDif;
    }


    public static void verificarDni(String dni) {

        if (dni.length() == 9) {
            System.out.println("dni valido.");
        } else {
            System.out.println("dni invalido");
        }
    }
}






