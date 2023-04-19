/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.usodejoptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author menji
 */

// nombre. correo, carrera y edad
public class UsoDeJOptionPane {

    public static void main(String[] args) {
        
        String nombre,correo, carrera;
        int edad;
        
        //Para pedir una cadena se utilza JOptionPane.showInputDialog
        nombre = JOptionPane.showInputDialog("Digite su nombre");
        correo = JOptionPane.showInputDialog("Digite su correo institucional");
         carrera = JOptionPane.showInputDialog("Digite su carrera");
        
        //Debemos convertir de cadena a entero
        //para ello usamos "Integer.parseInt" y colocamos normalmente la cadena que deseamos convertir
        edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));
        
        
        
        //Mostrar los datos
        
        JOptionPane.showMessageDialog(null,"${cursor}");
        JOptionPane.showMessageDialog(null,"Su correo institucional es "+correo);
        JOptionPane.showMessageDialog(null,"Pertenece a la carrera de "+carrera);
        JOptionPane.showMessageDialog(null,"Actualmente tienes "+edad);
        
        JOptionPane.showInputDialog("");
        
    }
}
