import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        final int MAX_ALUMNOS = 30; 
        int optionSelector = 0; 

        GestorEstudiantes gEstudiantes = new GestorEstudiantes();
        Estudiante [] estudiantes = new Estudiante[MAX_ALUMNOS];

        Scanner sc = new Scanner (System.in);
        System.out.println("Bienvenido al sistema gestor de alumnos. Selecciona una de las siguientes opciones: ");
        System.out.println("[1]. Añadir alumno");
        System.out.println("[2]. Visualizar alumno");
        System.out.println("[3]. Buscar alumno (por email)");

        optionSelector = sc.nextInt();

        do {
            switch (optionSelector) {
            case 1:
                gEstudiantes.anadirEstudiante(estudiantes); // Arreglar retorno al menú tras añadir a un alumno 
                break;
            case 2:
                gEstudiantes.visualizarEstudiantes(estudiantes);
                break;
            case 3:
                gEstudiantes.buscarPorEmail(estudiantes);
                break;
            default:
                break;
        }
        } while (optionSelector!=99);

    }
}
