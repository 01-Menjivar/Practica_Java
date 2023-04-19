
package Herencia;

/**
 *
 * @author menji
 */
public class Estudiante extends Persona{
    int codigoEstudiante;
    int notaFinal;

    
    //Constructor de clase estudiante
    public Estudiante(int codigoEstudiante, int notaFinal, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    
    
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        System.out.println("Codigo: "+codigoEstudiante);
        System.out.println("Nota: "+notaFinal);
    }
    
}
