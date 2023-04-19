/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesyObjetos;

/**
 *
 * @author menji
 */
public class Coche {
    
    String color;
    String modelo;
    int anio;
         
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        coche1.modelo = "Toyota Echo";
        coche1.anio = 2005;
        coche1.color = "gris";
        
        Coche coche2 = new Coche();
        coche2.modelo = "Honda Civic";
        
        System.out.println("El coche 1 es un: "+coche1.modelo+ " color "+coche1.color+" del anio "+coche1.anio);
        System.out.println("El coche 2 es un: "+coche2.modelo);
        
    }
    
}
