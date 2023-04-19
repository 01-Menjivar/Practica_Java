/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorial.joptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author menji
 */
public class FactorialJOptionPane {

    public static void main(String[] args) {
        int numero = 0;
        
       
      numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero al que desea sacar el factorial"));
        
      for(int i = numero-1; i>=1; i--){
        numero = numero * i;
    }
    
        JOptionPane.showMessageDialog(null, "El factorial del numero es: "+numero);
        
        }
}
