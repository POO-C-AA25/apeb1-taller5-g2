/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallergrupal5;
import java.util.Arrays;
/**
 *
 * @author UTPL
 */
public class TallerGrupal5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante listaEstudiantes[] = new Estudiante[3];
        listaEstudiantes[0] = new Estudiante("Andrea", 8.0);
        listaEstudiantes[1] = new Estudiante("Matew", 10.0);
        listaEstudiantes[2] = new Estudiante("Diego", 6.4);
        System.out.println("ListEstudiantes: " + Arrays.toString(listaEstudiantes));
        //Forma corta
        Estudiante listEst[] = {new Estudiante ("Mateo", 10.0),
                                new Estudiante ("Stalin", 9.5),
                                new Estudiante ("Cristhian", 6.0)};
        for(Estudiante est: listEst){
            System.out.println(est.nombre + " con " + est.nota + ((est.nota>= 6.5)? "Aprobado": "Reprobrado"));
        }
    }
    
    
}
class Estudiante{
    public String nombre;
    public double nota;

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
           
}
