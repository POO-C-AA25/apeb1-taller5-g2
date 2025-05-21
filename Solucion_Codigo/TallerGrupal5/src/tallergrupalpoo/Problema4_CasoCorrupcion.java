package tallergrupalpoo;
public class Problema4_CasoCorrupcion {

    public String nombre;
    public int diasDesdeInicio;
    public String estado;
    public String detalles;
    public Problema4_Persona[] personasImplicadas;
    public int numPersonas;

    public Problema4_CasoCorrupcion(String nombre, int diasDesdeInicio, String detalles) {
        this.nombre = nombre;
        this.diasDesdeInicio = diasDesdeInicio;
        this.estado = "Iniciado";
        this.detalles = detalles;
        this.personasImplicadas = new Problema4_Persona[100];  // tamaño máximo arbitrario
        this.numPersonas = 0;
    }

    public void agregarPersona(Problema4_Persona persona) {
        if (numPersonas < personasImplicadas.length) {
            personasImplicadas[numPersonas] = persona;
            numPersonas++;
        } else {
            System.out.println("No se pueden agregar más personas al caso.");
        }
    }

    public void actualizarEstado() {
        if (diasDesdeInicio > 14) {
            estado = "Urgente";
        } else if (diasDesdeInicio > 7) {
            estado = "Alerta";
        } else {
            estado = "Iniciado";
        }
    }

    @Override
    public String toString() {
        String result = "Caso: " + nombre + ", Días desde inicio: " + diasDesdeInicio
                + ", Estado: " + estado + ", Detalles: " + detalles + "\nPersonas Implicadas:\n";
        for (int i = 0; i < numPersonas; i++) {
            result += personasImplicadas[i].toString() + "\n";
        }
        return result;
    }
}