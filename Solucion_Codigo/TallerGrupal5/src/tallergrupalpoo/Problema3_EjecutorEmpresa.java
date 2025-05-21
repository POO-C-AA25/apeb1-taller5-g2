
package tallergrupalpoo;
import java.util.Scanner;

public class Problema3_EjecutorEmpresa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la empresa: ");
        String nombreEmpresa = scanner.nextLine();

        System.out.print("Ingrese el RUC de la empresa: ");
        String ruc = scanner.nextLine();

        System.out.print("Ingrese la dirección de la empresa: ");
        String direccion = scanner.nextLine();

        Problema3_Empresa empresa = new Problema3_Empresa(nombreEmpresa, ruc, direccion);

        while (true) {
            System.out.print("Ingrese el nombre del departamento (o 'salir' "
                    + "para terminar): ");
            String nombreDepto = scanner.nextLine();
            if (nombreDepto.equalsIgnoreCase("salir")) {
                break;
            }

            System.out.print("Ingrese el número de empleados: ");
            int numEmpleados = scanner.nextInt();

            System.out.print("Ingrese la producción anual: ");
            double produccionAnual = scanner.nextDouble();
            scanner.nextLine();

            Problema3_Departamento departamento = new Problema3_Departamento(nombreDepto,
                    numEmpleados, produccionAnual);
            empresa.agregarDepartamento(departamento);
        }

        empresa.mostrarDepartamentos();
    }
}
