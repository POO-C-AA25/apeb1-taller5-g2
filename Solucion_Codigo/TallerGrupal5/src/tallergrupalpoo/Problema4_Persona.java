package tallergrupalpoo;
public class Problema4_Persona {

    public String nombre;
    public int edad;
    public String ocupacion;
    public String nivelImplicacion;
    public boolean colaboracion;

    public Problema4_Persona(String nombre, int edad, String ocupacion, String nivelImplicacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.nivelImplicacion = nivelImplicacion;
        this.colaboracion = false;
    }

    public void ofrecerColaboracion() {
        this.colaboracion = true;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Ocupación: " + ocupacion + 
               ", Nivel de Implicación: " + nivelImplicacion + ", Colaboración: " + colaboracion;
    }
}