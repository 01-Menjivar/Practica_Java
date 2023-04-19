/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesyMetodos;

import javax.swing.JOptionPane;

/**
 *
 * @author menji
 */
public class Operacion {
    
    //Atributos
    
    double a;
    double b;
    double suma;
    double resta;
    double multiplicacion;
    double division;
    
    
    //Metodos
    
    //Metodo para pedir numeros;
    
    public void leerNumeros(){
    
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer numero"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo numero"));
    }
    
    //Metodos para las operaciones
     public void Suma(){
         suma = a+b;
     }
    
     public void Resta(){
     resta = a-b;
     }
     
     public void Multiplicacion(){
     multiplicacion = a*b;
     }
     
     public void Division(){
     division = a/b;
     }
     
     public void mostrarResultados(){
         System.out.println("La suma es " +suma);
         System.out.println("La resta es " +resta);
         System.out.println("La multiplicacion es " +multiplicacion);
         System.out.println("La division es " +division);
     }
     
     
     }

    
    
 

