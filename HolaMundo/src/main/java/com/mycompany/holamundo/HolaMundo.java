/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.holamundo;

import java.io.PrintStream;

/**
 *
 * @author menji
 */
public class HolaMundo { //Todo esta dentro de clases, incluso la funcion main
    
    //Diferencia entre clases y estructuras (en las clases llevo funciones, en las estructuras me limito a declarar variables)
    
     //el "static" quiere decir que estan fuera de la clase, son globales y estan accesibles para cualquier objeto.
    
    
    int edad = 19;
    
    public static void main(String[] args) { //Todas las clases comienzan en mayuscula por convencion
        System.out.println("Hola mundo");
        System.out.println("Utilizando un atajo");
        //Recordar utilizar "sout" + tab para hacerlo even faster.
        
        int cantidad = 500;
        
        System.out.println("El numero almacenado en la variable cantidad es "+cantidad);
        //Con las variables no primitivas podemos hacer uso de metodos
        /*
        Algunos ejemplos de variables no primitivas son Integer,string
        */
        
       final int constante = 6;
        System.out.println("El valor k es "+constante);
        /*Para agregar constantes debemos colocar "final" antes del tipo de
        variable*/
        
       
    }
}
