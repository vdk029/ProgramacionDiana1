package Tema8;


public class Asignatura {
    public static void main(String[] args) {
        Operaciones op = new Operaciones();

        // Ver alumnos
        op.getEstudiantePorCasa("Gryffindor");

        // Ver mascota
        op.getMascotaEstudiante("Hermione", "Granger");

        // Contar estudiantes
        op.contarEstudiantesPorCasa();


        // 4. Insertar asignatura
        op.insertarAsignatura("Magia Random", "Aula 404", true);

        // Cambiamos el id de asignatura
        op.modificarAula(17, "Magia no Random");

        //  Eliminar asignatura
        op.eliminarAsignatura(" Magia Random");

        System.out.println("¡Ejercicio completado al 100%!");
    }
    }
