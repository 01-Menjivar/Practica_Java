/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.entradadedatos;

import java.util.Scanner;

/**
 *
 * @author menji
 */
public class EntradaDeDatos {

    
            
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        //Podemos usar la palabra clave que deseemos para guardar datos
        //Recordemos que nos va a pedir importar el java.util.Scanner
        
        int dato;
        double decimal;
        String nombre;
        
        
        
        System.out.println("Digite un numero entero del 1 al 100");
        dato = in.nextInt();
        //Recordar el next() correspondiente a cada tipo de dato.
        
        System.out.println("El numero es "+dato);
        
        System.out.println("Digite un numero con decimales");
        decimal = in.nextDouble();
        
        System.out.println("El numero con decimal fue "+decimal);
        
        System.out.println("Digite el nombre de su mascota");
        nombre = in.next();
        
        System.out.println("El nombre de la querida mascota es: "+nombre);
        
       in.nextLine(); //Ayuda a limpiar el bufer
        
        System.out.println("Digite una cadena");
        String completo = in.nextLine();
        
        System.out.println("La cadena es: "+completo);
        
        
      
        
    }
}
