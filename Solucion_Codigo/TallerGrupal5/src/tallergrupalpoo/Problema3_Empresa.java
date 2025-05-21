package tallergrupalpoo;
import java.util.ArrayList;
import java.util.List;

public class Problema3_Empresa {

    public String nombre;
    public String ruc;
    public String direccion;
    public List<Problema3_Departamento> departamentos;

    public Problema3_Empresa(String nombre, String ruc, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.departamentos = new ArrayList<>();
    }

    public void agregarDepartamento(Problema3_Departamento departamento) {
        departamentos.add(departamento);
    }

    public void mostrarDepartamentos() {
        for (Problema3_Departamento depto : departamentos) {
            System.out.println(depto.toString());
        }
    }

    @Override
    public String toString() {
        return "Empresa: " + nombre + ", RUC: " + ruc + ", Dirección: " + direccion;
    }
}