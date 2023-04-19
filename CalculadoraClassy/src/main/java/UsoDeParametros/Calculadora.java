/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UsoDeParametros;

import javax.swing.JOptionPane;

/**
 *
 * @author menji
 */
public class Calculadora {
    
    //Atributos
    int resultado;
     
   //Metodos 
    
    //Lectura de datos
   
    
    public void Sumatoria(int a, int b){
    resultado = a+b;
    }
    
    public void MostrarDatos(){
        JOptionPane.showMessageDialog(null, "El resultado de la sumatoria es: "+resultado);
    }
    
    
    
}
