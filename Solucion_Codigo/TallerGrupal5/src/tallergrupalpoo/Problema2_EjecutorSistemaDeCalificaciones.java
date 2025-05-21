package tallergrupalpoo;
import java.util.Scanner;
public class Problema2_EjecutorSistemaDeCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        int edad = sc.nextInt();
        Problema2_Estudiante estudiante = new Problema2_Estudiante(nombre, edad);
        sc.nextLine(); 

        System.out.print("Ingrese el nombre de la materia: ");
        String nombreMateria = sc.nextLine();
        System.out.print("Ingrese la nota ACD (sobre 3.5): ");
        double acd = sc.nextDouble();
        System.out.print("Ingrese la nota APE (sobre 3.5): ");
        double ape = sc.nextDouble();
        System.out.print("Ingrese la nota AA (sobre 3.0): ");
        double aa = sc.nextDouble();

        Problema2_Materia materia = new Problema2_Materia(nombreMateria, acd, ape, aa);
        estudiante.asignarMateria(materia);
        estudiante.verificarAprobacion();
    }
}
