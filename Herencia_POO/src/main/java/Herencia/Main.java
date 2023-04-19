/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author menji
 */
public class Main {
    public static void main(String[] args) {
        
      Persona person1 = new Persona("Oscar","Ayala",19);
      Estudiante student1 = new Estudiante(123,10,"Oscar","Ayala",19);
      
        student1.mostrarDatos();
    }
}
