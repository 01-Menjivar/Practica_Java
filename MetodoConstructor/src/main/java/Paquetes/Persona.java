/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquetes;

/**
 *
 * @author menji
 */
public class Persona {
    
    //Atributos
    
    String nombre;
    int edad;
    
    //Metodos
    //Constructor
    public Persona(String nombre, int edad ){
    this.nombre = nombre;
    this.edad = edad;
    }
    
    public void MostrarDatos(){
        System.out.println("El nombre es "+nombre);
        System.out.println("Tiene "+edad+" anios de edad");
    }
    
    
    
    
}
