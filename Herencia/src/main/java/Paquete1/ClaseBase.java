/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

/**
 *
 * @author menji
 */
public class ClaseBase {
    
   private String nombre;
   public int edad;
   protected int anio;

    public ClaseBase(String nombre, int edad, int anio) {
        this.nombre = nombre;
        this.edad = edad;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
   
   String mostrar(){
   return "Atrib1: "+nombre+"\nAtrib2: "+edad+"\nAtrib3: "+anio;
   
   }
    
   
   
   
}
